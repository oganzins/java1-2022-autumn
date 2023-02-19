package lv.javaguru.training.lessons5;

public class DoWhileBrake {
    public static void main(String[] args) {
        int i = 0;
        do{
            System.out.print("i=" + i + ";");
            if (i == 3){
                break;
            }
            i++;
        }while (i < 5);
    }
}
