package lv.javaguru.training.lesson6;

public class UniqueArray {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 5, 3, 1, 10};
        int[] uniqueNumbers = uniqueOf(numbers);
    }
    public static int[] uniqueOf(int[] numbers) {
        int[] uniqueNumbers = new int[numbers.length];
        int uniqueNumbersAdded = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (uniqueNumbersAdded == 0) {
                uniqueNumbers[i] = numbers[i];
                uniqueNumbersAdded++;
            } else {
                boolean isNumberUnique = true;
                for (int j = 0; j < uniqueNumbersAdded; i++) {
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
        int[] result = new int [uniqueNumbersAdded];
        for (int i = 0; i < uniqueNumbersAdded; i++);

        return null;
    }
}
