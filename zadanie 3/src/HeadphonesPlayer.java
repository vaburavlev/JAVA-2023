public class HeadphonesPlayer extends MusicPlayer {
    public HeadphonesPlayer(Device device) {
        super(device);
    }

    @Override
    public void playMusic() {
        device.turnOn();
        System.out.println("Слушать музыку через наушники");
        device.turnOff();
    }
}