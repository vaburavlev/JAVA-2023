// Реализация для наушников
public class Headphones implements Device {
    @Override
    public void turnOn() {
        System.out.println("Надеть наушники");
    }

    @Override
    public void turnOff() {
        System.out.println("Снять наушники");
    }
}