package lv.javaguru.training.lessons5;

public class Skim7WhileExample {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10){
            if (i == 7){
                continue;
            }
            System.out.println("Counter is " +i);
            i++;
        }
    }
}
