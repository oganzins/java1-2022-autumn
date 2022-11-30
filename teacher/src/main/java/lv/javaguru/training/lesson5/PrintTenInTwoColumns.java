package lv.javaguru.training.lesson5;

public class PrintTenInTwoColumns {

    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            System.out.print(i);
            System.out.print(" ");
            if (i % 2 == 0) {
                continue;
            }
            System.out.println();
        }
    }

}
