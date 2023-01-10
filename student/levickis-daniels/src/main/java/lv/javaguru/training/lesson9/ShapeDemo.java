package lv.javaguru.training.lesson9;

public class ShapeDemo {

    public static void main(String[] args) {
        Shape circle = new Circle(4);
        circle.calculateArea();
        System.out.println(circle.calculateArea());
        Shape rectangle = new Rectangle(3, 4);
        rectangle.calculateArea();
        System.out.println(rectangle.calculateArea());
        Shape square = new Square(5);
        square.calculateArea();
        System.out.println(square.calculateArea());
        Shape triangle = new Triangle(3, 9);
        triangle.calculateArea();
        System.out.println(triangle.calculateArea());

    }
}
