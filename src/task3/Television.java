package task3;
// Реализация устройства: Телевизор
class Television implements Device {
    @Override
    public void displayVideo(VideoStream stream) {
        System.out.println("Видео транслируется на телевизор: " + stream.getName());
    }
}