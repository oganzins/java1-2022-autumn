package lv.javaguru.training.lesson6;

public class ArraySum {
    public static void main(String[] args) {
        int[] arraySum = new int[5];
        arraySum[0] = 1;
        arraySum[1] = 3;
        arraySum[2] = 9;
        arraySum[3] = 11;
        arraySum[4] = 20;
        int sum = 0;
        for (int i = 0; i < arraySum.length; i++) {
            sum += arraySum[i];
        }
        System.out.println(sum);
    }


}