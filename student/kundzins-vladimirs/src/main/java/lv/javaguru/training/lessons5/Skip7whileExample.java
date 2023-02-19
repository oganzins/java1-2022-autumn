package lv.javaguru.training.lessons5;

public class Skip7whileExample {
    public static void main(String[] args) {
        int i = 1;
        do{
            if (i ==7){
                i++;
                continue;
            }
            System.out.println(i);
        }while (i <=10);
    }
}
