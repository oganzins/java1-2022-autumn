package lv.javaguru.training.lesson5;

public class UpsideDownTriangle {

    public static void main(String[] args) {
        printUpsideDownTriangle(10);
    }

    private static void printUpsideDownTriangle(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < size - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}