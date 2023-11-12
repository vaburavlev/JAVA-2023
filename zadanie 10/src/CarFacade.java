// Фасад, объединяющий все функции
class CarFacade {
    private Engine engine;
    private ClimateControl climateControl;
    private MusicPlayer musicPlayer;

    public CarFacade() {
        engine = new Engine();
        climateControl = new ClimateControl();
        musicPlayer = new MusicPlayer();
    }

    public void startCar() {
        engine.start();
        climateControl.turnOnAC();
        musicPlayer.playMusic();
    }

    public void stopCar() {
        musicPlayer.stopMusic();
        climateControl.turnOffAC();
        engine.stop();
    }
}
