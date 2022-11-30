package lv.javaguru.training.lesson5;

public class Triangle {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 9 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}