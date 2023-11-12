public class MediaPlayerPlayer extends MusicPlayer {
    public MediaPlayerPlayer(Device device) {
        super(device);
    }

    @Override
    public void playMusic() {
        device.turnOn();
        System.out.println("Играть музыку через плеер");
        device.turnOff();
    }
}
