package task10;

public class CarFacade {
    private Engine engine;
    private ClimateControl climateControl;
    private MusicPlayer musicPlayer;

    public CarFacade() {
        engine = new Engine();
        climateControl = new ClimateControl();
        musicPlayer = new MusicPlayer();
    }

    public void startCar(int temperature, String song) {
        engine.start();
        climateControl.setTemperature(temperature);
        climateControl.turnOnAC();
        musicPlayer.play(song);
    }

    public void stopCar() {
        musicPlayer.stop();
        climateControl.turnOffAC();
        engine.stop();
    }
}
