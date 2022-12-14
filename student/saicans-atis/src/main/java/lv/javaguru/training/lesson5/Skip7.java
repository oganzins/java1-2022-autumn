package lv.javaguru.training.lesson5;

public class Skip7 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            System.out.print("Counter is ");
            if (i ==7) {
                continue;
            }
            System.out.println(i);
        }
    }
}
