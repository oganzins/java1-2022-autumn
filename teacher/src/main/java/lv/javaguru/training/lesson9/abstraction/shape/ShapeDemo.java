package lv.javaguru.training.lesson9.abstraction.shape;

public class ShapeDemo {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(1, 2, 3);
        System.out.println(triangle.getName());
        System.out.println(triangle.calculatePerimeter());

        Circle circle = new Circle(10);
        System.out.println(circle.getName());
        System.out.println(circle.calculatePerimeter());

        Pentagon pentagon = new Pentagon(1, 2, 3, 4, 5);
        System.out.println(pentagon.getName());
        System.out.println(pentagon.calculatePerimeter());
    }

}
