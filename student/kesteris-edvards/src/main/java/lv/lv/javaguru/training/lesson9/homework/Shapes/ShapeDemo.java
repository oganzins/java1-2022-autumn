package lv.lv.javaguru.training.lesson9.homework.Shapes;

public class ShapeDemo {

    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println(circle.calculateArea());

        Rectangle rectangle = new Rectangle(3, 7);
        System.out.println(rectangle.calculateArea());

        Square square = new Square(10);
        System.out.println(square.calculateArea());

        Triangle triangle = new Triangle(13, 2);
        System.out.println(triangle.calculateArea());
    }
}
