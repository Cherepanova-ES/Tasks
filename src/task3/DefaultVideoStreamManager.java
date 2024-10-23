package task3;

public class DefaultVideoStreamManager extends VideoStreamManager {
    public DefaultVideoStreamManager(Device device) {
        super(device);
    }

    @Override
    public void playVideo(VideoStream stream) {
        device.displayVideo(stream);
    }
}
