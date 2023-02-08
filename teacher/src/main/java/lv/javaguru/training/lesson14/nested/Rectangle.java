package lv.javaguru.training.lesson14.nested;

public class Rectangle {

    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Area calculateArea() {
        return new Area();
    }

    public class Area {

        public int getValue() {
            return height * width;
        }

    }

}
