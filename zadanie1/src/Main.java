public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

// Создание объекта круга
        Shape circle = factory.createCircle(5);
        System.out.println("Площадь круга: " + circle.calculateArea());
        System.out.println("Периметр круга: " + circle.calculatPerimeter());

// Создание объекта треугольника
        Shape triangle = factory.createTriangle(3, 4, 5);
        System.out.println("Площадь треугольника: " + triangle.calculateArea());
        System.out.println("Периметр треугольника: " + triangle.calculatPerimeter());

// Создание объекта прямоугольника
        Shape rectangle = factory.createRectangle(4, 6);
        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());
        System.out.println("Периметр прямоугольника: " + rectangle.calculatPerimeter());
    }
}