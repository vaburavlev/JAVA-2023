abstract class CityObject {
    // Шаблонный метод для отрисовки объекта
    public final void draw() {
        drawBase();
        drawSpecific();
        drawAdditional();
    }

    // Базовая отрисовка, общая для всех объектов
    private void drawBase() {
        System.out.println("Отрисовка базовых элементов");
    }

    // Абстрактный метод для отрисовки специфичных элементов каждого объекта
    protected abstract void drawSpecific();

    // Метод для отрисовки дополнительных элементов, который может быть переопределен
    protected void drawAdditional() {
        System.out.println("Отрисовка дополнительных элементов");
    }
}

