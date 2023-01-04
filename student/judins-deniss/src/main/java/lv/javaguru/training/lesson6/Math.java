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
        int maxValue = Math.max(new int[]{4, 5, 10, -5, 1000000, 20, 13});

        int[][] numbers = new int [3][3];

        numbers[0][0] = 1;



        System.out.println("Max value is " + maxValue);
    }
}
