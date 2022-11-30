package lv.javaguru.training.lesson5;

public class DoWhilePermutation {

    public static void main(String[] args) {
        int permutation = 0;
        int i = 0;
        do {
            if ( i == 0) {
                permutation = 1;
            }
            if (i > 1) {
                permutation *= i;
            }
            i++;

        }while (i <= 5);
        System.out.println("Peramtutation of 5 is " + permutation);
    }

}
