package lv.javaguru.training.lesson5;

public class printOddNumbers {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            if (i % 2 ==1){
                // or (i % 2 != 0);
                System.out.println(i);
            }
            i++;
        }

    }
}
