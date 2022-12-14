package lv.javaguru.training.lesson6;

public class ArrayUtils {
    public int[] copy(int[] sourceArray) {

        for (int i = 0; i < sourceArray.length; ++i) {
            int[] source= {1, 3, 5, 7};
            // allocating space for each row of destination array
            sourceArray[i] = new int[source[i].length];

            for (int j = 0; j < destination[i].length; ++j) {
                destination[i][j] = source[i][j];
            }
        }

        // displaying destination array
        System.out.println(Arrays.deepToString(destination));
    }


}