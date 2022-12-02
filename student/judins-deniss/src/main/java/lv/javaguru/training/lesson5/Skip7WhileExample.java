package lv.javaguru.training.lesson5;

public class Skip7WhileExample {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 10) {
            if (i==7) {
                i++;
                continue;
            }
            System.out.println("Counter is " + i);
            i++;

        }
    }
}
