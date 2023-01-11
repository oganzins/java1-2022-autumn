package lv.javaguru.training.lesson5.Homework5;

public class MirroredTriangle {

    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 9 - i; j < 9; j++) {
                System.out.print(" ");
            }
            for (int j = 8; j > i; j--) {
                System.out.print("9 ");
            }
            System.out.println();
        }
    }
}