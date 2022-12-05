package lv.javaguru.training.lesson5;

public class DoWhileBreak {
    public static void main(String[] args) {
        int i = 0;
        do{
            System.out.println("i = " + i + ";"); //izdrukājam i = 0
            if (i == 3){ //pārbaudam vai i = 3
                break;
            }
            i++; // ja nav palielinām par 1

        }while(i < 5);
    }
}
