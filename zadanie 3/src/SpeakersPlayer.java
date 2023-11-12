public class SpeakersPlayer extends MusicPlayer {
    public SpeakersPlayer(Device device) {
        super(device);
    }

    @Override
    public void playMusic() {
        device.turnOn();
        System.out.println("Играть музыку через колонки");
        device.turnOff();
    }
}
