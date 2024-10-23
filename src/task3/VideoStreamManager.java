package task3;

abstract class VideoStreamManager {
    protected Device device;

    public VideoStreamManager(Device device) {
        this.device = device;
    }

    public abstract void playVideo(VideoStream stream);
}