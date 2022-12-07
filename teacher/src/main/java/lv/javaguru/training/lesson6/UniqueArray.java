package lv.javaguru.training.lesson6;

import java.util.Arrays;

public class UniqueArray {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 6, 7, 8, 8, 8};
        int[] uniqueNumbers = uniqueOf(numbers);

        System.out.println(Arrays.toString(uniqueNumbers));
    }

    public static int[] uniqueOf(int[] numbers) {
        int[] uniqueNumbers = new int[numbers.length];
        int uniqueNumbersAdded = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (uniqueNumbersAdded == 0) {
                uniqueNumbers[uniqueNumbersAdded] = numbers[i];
                uniqueNumbersAdded++;
            } else {
                boolean isNumberUnique = true;
                for (int j = 0; j < uniqueNumbersAdded; j++) {
                    if (uniqueNumbers[j] == numbers[i]) {
                        isNumberUnique = false;
                        break;
                    }
                }
                if (isNumberUnique) {
                    uniqueNumbers[uniqueNumbersAdded] = numbers[i];
                    uniqueNumbersAdded++;
                }
            }
        }

        int[] result = new int[uniqueNumbersAdded];
        for (int i = 0; i < uniqueNumbersAdded; i++) {
            result[i] = uniqueNumbers[i];
        }

        return uniqueNumbers;
    }

}
