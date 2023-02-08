package lv.javaguru.training.lesson14.nested;

public class RectangleDemo {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        int areaValue = rectangle.calculateArea().getValue();

        Rectangle.Area area = rectangle.new Area();

        System.out.println(areaValue);
        System.out.println(area.getValue());
    }

}
