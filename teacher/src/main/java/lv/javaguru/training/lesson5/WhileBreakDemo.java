package lv.javaguru.training.lesson5;

public class WhileBreakDemo {

    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            if (i == 3) {
                break;
            }
            System.out.print("i=" + i + "; ");
            i++;
        }

    }

}
