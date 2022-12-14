package lv.javaguru.training.lesson5;

public class PrintOddNumbers {

    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            i++;
        }

        System.out.println("End");
    }


}
