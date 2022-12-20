package lv.lv.javaguru.training.lesson7.homework;

public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        setWidth(width);
        setHeight(height);
    }

    public int getWidth() { return width; }

    public int getHeight() { return height; }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public int calculateArea() {
        return width * height;
    }

    public int calculatePerimeter() {
        return (width + height) * 2;
    }

}
