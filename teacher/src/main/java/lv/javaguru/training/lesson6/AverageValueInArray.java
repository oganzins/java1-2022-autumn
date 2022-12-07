package lv.javaguru.training.lesson6;

public class AverageValueInArray {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 2;
        numbers[1] = 4;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 2;

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        int averageValue = sum / numbers.length;

        System.out.println("Average value of numbers is " + averageValue);

    }

}
