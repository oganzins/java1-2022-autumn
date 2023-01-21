package lv.javaguru.training.lesson9.Shape;

public class ShapeDemo {

    public static void main(String[] args) {
         Circle circle = new Circle(12);
        System.out.println("Circle area:");
        System.out.println(circle.calculateArea());
        System.out.println();

        Rectangle rectangle = new Rectangle(4,17);
        System.out.println("Rectangle area:");
        System.out.println(rectangle.calculateArea());
        System.out.println();

        Square square = new Square(9);
        System.out.println("Square area:");
        System.out.println(square.calculateArea());
        System.out.println();

        Triangle triangle = new Triangle(13,8);
        System.out.println("Triangle area:");
        System.out.println(triangle.calculateArea());
        System.out.println();
    }
}
