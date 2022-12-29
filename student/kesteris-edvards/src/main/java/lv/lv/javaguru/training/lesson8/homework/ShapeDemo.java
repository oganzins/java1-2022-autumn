package lv.lv.javaguru.training.lesson8.homework;

public class ShapeDemo {

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("Circle length is " + circle.length());
        System.out.println("Circle area is " + circle.area());
        System.out.println();

        Cylinder cylinder = new Cylinder(10, 5);
        System.out.println("Cylinder volume is " + cylinder.volume());
        System.out.println();

        Cone cone = new Cone(10, 5);
        System.out.println("Cone volume is " + cone.volume());
        System.out.println();
    }

}
