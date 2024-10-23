package task3;
import java.util.HashMap;
import java.util.Map;

public class VideoStreamSystem {
    private Map<String, VideoStreamManager> managers = new HashMap<>();

    public void addManager(String deviceType, Device device) {
        VideoStreamManager manager = new DefaultVideoStreamManager(device);
        managers.put(deviceType, manager);
    }

    public void playVideo(String deviceType, VideoStream stream) {
        VideoStreamManager manager = managers.get(deviceType);
        if (manager != null) {
            manager.playVideo(stream);
        } else {
            System.out.println("Устройство с типом " + deviceType + " не найдено.");
        }
    }

    public static void main(String[] args) {
        VideoStreamSystem system = new VideoStreamSystem();
        system.addManager("телевизор", new Television());
        system.addManager("монитор", new Monitor());
        system.addManager("проектор", new Projector());

        VideoStream stream1 = new VideoStream("Футбольный матч");
        system.playVideo("телевизор", stream1);

        VideoStream stream2 = new VideoStream("Фильм");
        system.playVideo("проектор", stream2);
    }
}
