package lv.javaguru.training.lesson9.polymorphism.shape;

public class PolymorphismDemo {

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Triangle triangle = new Triangle(10, 5);
        Rectangle rectangle = new Rectangle(4, 5);
        Square square = new Square(10);

        Shape[] shapes = {circle, triangle, rectangle, square};
        for (Shape shape : shapes) {
            printShapeArea(shape);
        }
    }

    private static void printShapeArea(Shape shape) {
        System.out.println(shape.area());
    }

}
