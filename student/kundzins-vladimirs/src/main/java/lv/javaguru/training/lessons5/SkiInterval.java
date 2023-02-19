package lv.javaguru.training.lessons5;

public class SkiInterval {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            if( i > 5 || i < 9){
                continue;
            }
            System.out.println(i);
        }
    }
}
