package lv.javaguru.training.lesson5;

public class DoubleForLoopBreakExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(j);
                if (j == 3) {
                    break;
                }
            }
            System.out.println();
        }
    }
}
