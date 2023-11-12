public class Speakers implements Device {
    @Override
    public void turnOn() {
        System.out.println("Включить колонки");
    }

    @Override
    public void turnOff() {
        System.out.println("Выключить колонки");
    }
}
