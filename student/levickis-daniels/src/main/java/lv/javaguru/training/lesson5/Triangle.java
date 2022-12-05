package lv.javaguru.training.lesson5;

public class Triangle {
    public static void main(String[] args) {

        printTriangle(10);

    }

    public static void printTriangle(int size) {


        for (int i = 0; i <= size; i++) {
            for (int j = size - i; j > 0; j--) {
                System.out.print("b");


            }
            for (int k= 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();


        }
    }
}