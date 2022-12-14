package lv.javaguru.training.lesson5;

public class Print10In2Columns {
    public static void main(String[] args) {
        for (int i = 1; i<= 10; i++) {
            System.out.print(i);
            System.out.print(" ");
            if (i % 2 != 0) {
                continue;
            }
            System.out.println();
        }
    }
}
