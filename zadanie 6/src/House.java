class House extends CityObject {
    // Реализация отрисовки специфичных элементов для дома
    @Override
    protected void drawSpecific() {
        System.out.println("Отрисовка дома");
    }
}

class Road extends CityObject {
    // Реализация отрисовки специфичных элементов для дороги
    @Override
    protected void drawSpecific() {
        System.out.println("Отрисовка дороги");
    }

    // Переопределение метода для отрисовки дополнительных элементов
    @Override
    protected void drawAdditional() {
        System.out.println("Отрисовка дополнительных элементов для дороги");
    }
}

class Shop extends CityObject {
    // Реализация отрисовки специфичных элементов для магазина
    @Override
    protected void drawSpecific() {
        System.out.println("Отрисовка магазина");
    }
}
