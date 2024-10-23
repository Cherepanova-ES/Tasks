package task3;

public class Projector implements Device {
    @Override
    public void displayVideo(VideoStream stream) {
        System.out.println("Видео транслируется на проектор: " + stream.getName());
    }
}
