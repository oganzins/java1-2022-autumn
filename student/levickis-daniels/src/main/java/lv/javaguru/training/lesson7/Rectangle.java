package lv.javaguru.training.lesson7;

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

    public int getHeight() {

        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calculateArea() {
        int area;
        area = width * height;
        return area;
    }


    public int calculatePerimeter() {
        int perimeter;
        perimeter = width + width + height + height;
        return perimeter;
    }


}

