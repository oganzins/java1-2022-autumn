package lv.javaguru.training.lesson5.homework;

public class Triangle2 {

    public static void main(String[] args) {
        for (int i = 9; i > 0; i--) {
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
