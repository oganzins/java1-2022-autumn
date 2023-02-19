package lv.javaguru.training.homework7;

public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }
    public int getHeight(){
        return height;
    }
    public int calculateArea(){
        int area;
        area = width * height;
        return area;
    }
    public int calculatePerimeter(){
        int perimeter;
        perimeter = (width + height) * 2;
        return perimeter;
    }

}
