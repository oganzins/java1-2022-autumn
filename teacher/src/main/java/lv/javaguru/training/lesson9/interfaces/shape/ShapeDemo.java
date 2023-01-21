package lv.javaguru.training.lesson9.interfaces.shape;

public class ShapeDemo {

    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println(circle.calculatePerimeter());

        Triangle triangle = new Triangle(1, 2, 3);
        System.out.println(triangle.calculatePerimeter());

        Rectangle rectangle = new Rectangle(4, 2);
        System.out.println(rectangle.calculatePerimeter());

        Square square = new Square(2);
        System.out.println(square.calculatePerimeter());
    }

}
