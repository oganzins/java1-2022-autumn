package lv.javaguru.training.lesson9.homework.Shapes;

public class ShapeDemo {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.calculateArea());
        System.out.println();

        Rectangle rectangle = new Rectangle(7, 10);
        System.out.println(rectangle.calculateArea());
        System.out.println();

        Triangle triangle = new Triangle(5, 8);
        System.out.println(triangle.calculateArea());
        System.out.println();

        Square square = new Square(4);
        System.out.println(square.calculateArea());
        System.out.println();


    }
}
