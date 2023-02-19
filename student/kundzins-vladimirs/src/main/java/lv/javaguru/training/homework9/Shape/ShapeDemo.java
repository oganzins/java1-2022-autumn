package lv.javaguru.training.homework9.Shape;

public class ShapeDemo {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.calculateArea());

        System.out.println();

        Rectangle rectangle = new Rectangle(2, 5);
        System.out.println(rectangle.calculateArea());

        System.out.println();

        Triangle triangle = new Triangle(1, 2);
        System.out.println(triangle.calculateArea());

        System.out.println();

        Square square = new Square(1);
        System.out.println(square.calculateArea());

        System.out.println();
    }
}
