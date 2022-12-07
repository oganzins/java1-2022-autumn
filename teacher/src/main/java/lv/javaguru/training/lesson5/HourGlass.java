package lv.javaguru.training.lesson5;

public class HourGlass {

    public static void main(String[] args) {
        printHourGlass(20);
    }

    private static void printHourGlass(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i && i < size / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < size / 2 - i && i < size / 2; j++) {
                System.out.print(" *");
            }

            for (int j = 0; j < size - i && i >= size / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i - size / 2 && i >= size / 2; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }


    }

}
