package lv.javaguru.training.lesson4;

public class IfElseIfDemo {

    public static void main(String[] args) {
        IfElseIfDemo demo = new IfElseIfDemo();

        demo.print(1);
        demo.print(11);
        demo.print(16);
    }

    public void print(int x) {
        System.out.println("Number value is " + x);
        if (x < 10) {
            System.out.println("Number is less than 10");
        } else if (x > 15) {
            System.out.println("Number is greater than 15");
        }
        System.out.println();
    }


}
