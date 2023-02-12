package lv.javaguru.training.lesson9.Shapes;

public class Square implements Shape{

    private double side;
    public  Square(double side){
        this.side = side;
    }
    @Override
    public double calculateArea(){
        return side * side;
    }
}
