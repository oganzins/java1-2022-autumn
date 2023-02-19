package lv.javaguru.training.lessons6;

public class UniqueArray {

    public static void main(String[] args) {
        int[] numbers = {5, 10, 5, 3, 1, 10};
        int[] uniqueNumbers = uniqueOf(numbers);
    }

    public static int[] uniqueOf(int[] numbers) {
        int[] uniqueNumbers =new int[numbers.length];
        int uniqueNumbersAdded = 0;


        for(int i = 0; i < numbers.length; i++){
            if (uniqueNumbersAdded == 0){
                uniqueNumbers[i] = numbers[i];
                uniqueNumbersAdded++;
            }else{
                boolean isNumbersUnique = true;
            }
                for(int j = 0; j < uniqueNumbersAdded; j++){
                    if (uniqueNumbers[j] == numbers[i]){
                        break;
                    }else{
                }
            }
        }

        return null;
    }
}
