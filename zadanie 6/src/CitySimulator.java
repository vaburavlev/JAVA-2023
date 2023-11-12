public class CitySimulator {
    public static void main(String[] args) {
        // Пример использования шаблонного метода
        CityObject house = new House();
        CityObject road = new Road();
        CityObject shop = new Shop();

        house.draw();
        System.out.println("--------");
        road.draw();
        System.out.println("--------");
        shop.draw();
    }
}