package lv.javaguru.training.lesson5;

public class DoubleForLoopBreak {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; i++) {
                System.out.print(j);
            }
            System.out.println();
            break;
        }
    }
}
