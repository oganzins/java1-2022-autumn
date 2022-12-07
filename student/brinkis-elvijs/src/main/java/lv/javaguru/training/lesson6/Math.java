package lv.javaguru.training.lesson6;

public class Math {
    public int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }

    }

    public static int max(int[] numbers) {
        int maxNumber = 0;
        for (int number : numbers) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        return maxNumber;
    }



    public static void main(String[] args) {
        Math math = new Math();
        int maxValue = math.max(10, 5);

        System.out.println("Max value is " + maxValue);
    }
}
