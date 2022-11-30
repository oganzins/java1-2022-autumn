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
        if (a == a) {
            System.out.println("Numbers are equal");
        }
        if (a != b) {
            System.out.println("Numbers are not equals");
        }
        if (a > b) {
            System.out.println("Numbers A is greather than B");
        }
        if (a < b) {
            System.out.println("Number A is less than B");
        }
        if (a <= b) {
            System.out.println("Number A is less or equal than B");
        }
        if (a >=b) {
            System.out.println("Number A is greather or equal than B");
        }
        if (a == 0 && b == 0) {
            System.out.println("Both numbers are zero");
        }
        if (a == 0 || b == 0) {
            System.out.println("One of the Number is zero");
        }
        if (!(a == 0 || b == 0)) {
            System.out.println("None of the number is zero");
        }
    }

    public static void main(String[] args) {
        OperatorExamples demo = new OperatorExamples(5, 5);
        demo.print();
    }
}
