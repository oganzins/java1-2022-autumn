package lv.javaguru.training.lesson9.homework.shapes;

public class ShapeDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(1.23);
        System.out.println("Circle area: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(2.34, 3.45);
        System.out.println("Rectangle area: " + rectangle.calculateArea());

        Square square = new Square(4.56);
        System.out.println("Square area: " + square.calculateArea());

        Triangle triangle = new Triangle(5.67, 6.78);
        System.out.println("Triangle area: " + triangle.calculateArea());
    }
}
