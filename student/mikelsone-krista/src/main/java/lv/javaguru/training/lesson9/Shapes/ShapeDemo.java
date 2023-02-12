package lv.javaguru.training.lesson9.Shapes;

public class ShapeDemo {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.calculateArea());

        Rectangle rectangle = new Rectangle(6,12);
        System.out.println(rectangle.calculateArea());

        Square square = new Square(15.2);
        System.out.println(square.calculateArea());

        Triangle triangle = new Triangle(5.6,9);
        System.out.println(triangle.calculateArea());
    }
}
