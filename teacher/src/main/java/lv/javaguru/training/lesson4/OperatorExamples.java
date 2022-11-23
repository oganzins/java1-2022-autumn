package lv.javaguru.training.lesson4;

public class OperatorExamples {

    private int a;
    private int b;

    public OperatorExamples(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void print() {
        System.out.println("A : " + a);
        System.out.println("B : " + b);
        if (a == b) {
            System.out.println("Numbers are equal");
        }
        if (a != b) {
            System.out.println("Numbers are not equal");
        }
        if (a > b) {
            System.out.println("A is greater than B");
        }
        if (a >= b) {
            System.out.println("A is greater or equal to B");
        }
        if (a < b) {
            System.out.println("A is less than B");
        }
        if (a <= b) {
            System.out.println("A is less or equal to B");
        }
        if (a == 0 && b == 0) {
            System.out.println("Both are numbers are zero");
        }
        if (a == 0 || b == 0) {
            System.out.println("One of the numbers is zero");
        }
        if (!(a == 0 || b == 0)) {
            System.out.println("None of the numbers is zero");
        }
    }


    public static void main(String[] args) {
        OperatorExamples demo = new OperatorExamples(5, 5);

        demo.print();
    }


}
