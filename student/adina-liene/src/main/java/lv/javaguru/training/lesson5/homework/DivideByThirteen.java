package lv.javaguru.training.lesson5.homework;

public class DivideByThirteen {

    public static void main(String[] args) {
        int i = 0;

        do {
            if (i % 13 != 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        } while (i <= 100);


    }
}
