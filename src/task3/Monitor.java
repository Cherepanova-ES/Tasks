package task3;

public class Monitor implements Device {
    @Override
    public void displayVideo(VideoStream stream) {
        System.out.println("Видео транслируется на монитор: " + stream.getName());
    }
}
