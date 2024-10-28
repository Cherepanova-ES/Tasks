package task11;

public class Main {
    public static void main(String[] args) {
        // Создаем базовые настройки
        AppSettings defaultSettings = new AppSettings("Dark", 14, "English");

        // Клонируем настройки для пользователя 1
        User user1 = new User("Alice", defaultSettings.clone());

        // Клонируем настройки для пользователя 2 и изменяем язык
        User user2 = new User("Bob", defaultSettings.clone());
        user2.getSettings().setLanguage("Spanish");

        // Выводим информацию о пользователях и их настройках
        System.out.println(user1);
        System.out.println(user2);

        // Изменяем настройки пользователя 1
        user1.getSettings().setFontSize(16);

        // Проверяем изменения
        System.out.println("После изменения настроек пользователя 1:");
        System.out.println(user1);
        System.out.println(user2); // Настройки пользователя 2 не изменились
    }
}

