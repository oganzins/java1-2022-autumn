package lv.javaguru.training.lesson5;

public class DoWhilePrint10Backwards {
    public static void main(String[] args) {
        int i = 10;
        do {
            System.out.println(i);
            i--;
        } while (i > 0);
    }
}
