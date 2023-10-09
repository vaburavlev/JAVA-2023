public class ShapeFactory {
    public Shape createCircle(double radius) {
        return new Circle(radius);
    }

    public Shape createTriangle(double side1, double side2, double side3) {
        return new Triangle(side1, side2, side3);
    }

    public Shape createRectangle(double length, double width) {
        return new Rectangle(length, width);
    }
}
