package lv.javaguru.training.lesson7.homework;

public class RectangleDemo {
    public static void main(String[] args) {
        print(new Rectangle(5,4));
        print(new Rectangle(9, 10));
        print(new Rectangle(1, 2));
    }

    private static void print(Rectangle rectangle) {
        System.out.println("Rectangle width is " + rectangle.getWidth());
        System.out.println("Rectangle height is " + rectangle.getHeight());
        System.out.println("Rectangle area is " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter is " + rectangle.calculatePerimeter());
        System.out.println();
    }
}
