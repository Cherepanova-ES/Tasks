package task9;

import java.util.concurrent.*;

public class DataCache<K, V> {
    private final ConcurrentHashMap<K, CacheValue<V>> cache = new ConcurrentHashMap<>();
    private final long expirationTime; // Время жизни кэша в миллисекундах

    public DataCache(long expirationTime) {
        this.expirationTime = expirationTime;
        startCleanupTask();
    }

    public void put(K key, V value) {
        cache.put(key, new CacheValue<>(value, System.currentTimeMillis()));
    }

    public V get(K key) {
        CacheValue<V> cacheValue = cache.get(key);
        if (cacheValue == null || isExpired(cacheValue)) {
            cache.remove(key);
            return null; // Или можно вернуть значение по умолчанию
        }
        return cacheValue.value;
    }

    private boolean isExpired(CacheValue<V> cacheValue) {
        return (System.currentTimeMillis() - cacheValue.timestamp) > expirationTime;
    }

    private void startCleanupTask() {
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        executor.scheduleAtFixedRate(() -> {
            long now = System.currentTimeMillis();
            cache.forEach((key, value) -> {
                if (isExpired(value)) {
                    cache.remove(key);
                }
            });
        }, expirationTime, expirationTime, TimeUnit.MILLISECONDS);
    }

    private static class CacheValue<V> {
        V value;
        long timestamp;

        CacheValue(V value, long timestamp) {
            this.value = value;
            this.timestamp = timestamp;
        }
    }

    // Пример использования
    public static void main(String[] args) throws InterruptedException {
        DataCache<String, String> dataCache = new DataCache<>(5000); // Кэш с временем жизни 5 секунд

        dataCache.put("key1", "value1");
        System.out.println("Cached value: " + dataCache.get("key1")); // Должно вывести "value1"

        Thread.sleep(6000); // Ждем 6 секунд, чтобы значение устарело
        System.out.println("Cached value after expiration: " + dataCache.get("key1")); // Должно вывести "null"
    }
}


