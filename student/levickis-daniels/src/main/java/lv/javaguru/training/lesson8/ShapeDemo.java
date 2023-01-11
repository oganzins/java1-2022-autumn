package lv.javaguru.training.lesson8;

public class ShapeDemo {


        public static void main(String[] args) {
            Circle circle = new Circle(10.0);
            System.out.println("Circle length is " + circle.getLength());
            System.out.println("Circle area is " + circle.getArea());
            System.out.println();

            Cylinder cylinder = new Cylinder(10, 5);
            System.out.println("Cylinder volume is " + cylinder.getVolume());
            System.out.println();

            Clone clone = new Clone(10, 5);
            System.out.println("Cone volume is " + clone.getVolume());
            System.out.println();
        }

    }












