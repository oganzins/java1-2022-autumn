package lv.javaguru.training.lesson5;

public class Skip7DoWhileExample {
    public static void main(String[] args) {
        int i = 0;
        do {
            if (i == 7) {
            i++;
            continue;}
            System.out.println(i);
        } while (i <=10);

    }
}
