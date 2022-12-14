package lv.javaguru.training.lesson6;

public class Math {

    public static int max(int a, int b) {
        if (a > b) {
            return a; }
                else {
                    return b;
        }
    }

    public static int max(int[] numbers) {

        int maxNumber = 0;
        for (int number : numbers) {
            if(number > maxNumber) {
                maxNumber = number;
            }
        }

        return maxNumber;

    }

    public static void main(String[] args) {
        Math math = new Math();
        int maxValue = Math.max(new int[]{-1, 10, 5, 3, 1000, 5, 2});

        int[][] numbers = new int [3][3];

        numbers[0][0] = 1;



        System.out.println("Max value is " + maxValue);
    }
}
