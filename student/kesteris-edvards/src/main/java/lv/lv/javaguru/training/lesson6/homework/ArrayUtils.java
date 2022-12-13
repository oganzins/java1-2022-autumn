package lv.lv.javaguru.training.lesson6.homework;


public class ArrayUtils {

    public int[] copy(int[] sourceArray) {
        for (int i = 0; i < sourceArray.length; i++){

        }
        return sourceArray;
    }

    public int[] reverse(int[] sourceArray) {
        for(int i = 0; i < sourceArray.length / 2; i++){
            int j = sourceArray[i];
            sourceArray[i] = sourceArray[sourceArray.length -i -1];
            sourceArray[sourceArray.length -i -1] = j;
        }
        return sourceArray;
    }
}
