package lv.javaguru.training.lesson9.homework.Task2;

public class ShapeDemo {

    public static void main(String[] args) {
        Circle circle = new Circle(4.984050996048314);
        System.out.println(circle.calculateArea());

        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println(rectangle.calculateArea());

        Square square = new Square(3);
        System.out.println(square.calculateArea());

        Triangle triangle = new Triangle(7, 10);
        System.out.println(triangle.calculateArea());

    }

}
