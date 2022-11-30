package lv.javaguru.training.lesson5;

public class DoWhileBreak {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.print("i=" + i + ";");
            if (i == 3) {
                break;

            }
            i++;

        }
        while (i < 5);


    }
}
