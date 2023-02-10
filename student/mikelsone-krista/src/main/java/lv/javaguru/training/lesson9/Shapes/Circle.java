package lv.javaguru.training.lesson9.Shapes;

public class Circle implements Shape{

    public double radius;

    public Circle(double radius){
        this.radius = radius;

    }
    @Override
    public double calculateArea(){
        return 3.14 * (radius * radius);
    }
}
