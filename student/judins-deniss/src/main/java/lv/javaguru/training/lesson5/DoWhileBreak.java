package lv.javaguru.training.lesson5;

public class DoWhileBreak {

    public static void main(String[] args) {

        int i = 0;
        do {
            if (i == 3) {
                break;
            }
            System.out.print("i=" + i + "; ");
            i++;
        } while (i < 5);
    }
}
