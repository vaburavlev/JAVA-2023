public class MediaPlayer implements Device {
    @Override
    public void turnOn() {
        System.out.println("Включить плеер");
    }

    @Override
    public void turnOff() {
        System.out.println("Выключить плеер");
    }
}