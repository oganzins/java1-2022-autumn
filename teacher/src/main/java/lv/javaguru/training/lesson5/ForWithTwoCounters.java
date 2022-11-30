package lv.javaguru.training.lesson5;

public class ForWithTwoCounters {

    public static void main(String[] args) {
        int a = 0, b = 1, c = 3;

        for (int i = 0, j = 0; i < 5 && j < 3; i++, j++) {
            System.out.println("Hello World!");
        }
    }

}
