package lv.javaguru.training.lesson5;

public class Increment {

    public static void main(String[] args) {
        int i = 0;
        i = i + 1;

        System.out.println("i=" + i);

        int j = 0;
        j += 1;

        System.out.println("j=" + j);

        int k = 0;
        k++;

        System.out.println("k=" + k);

        int l = 0;
        System.out.println("l=" + l++);

        /*

        System.out.println("l=" + l);
        l = l + 1;

         */

        int m = 0;
        System.out.println("m=" + ++m);


    }

}
