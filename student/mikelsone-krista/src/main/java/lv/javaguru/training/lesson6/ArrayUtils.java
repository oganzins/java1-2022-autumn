package lv.javaguru.training.lesson6;

public class ArrayUtils {

    int[] copy(int[] sourceArray){
        int[] copy = new int[sourceArray.length];
        for(int i = 0; i < sourceArray.length; i++){
            copy[i] = sourceArray[i];
        }
        return copy;
    }
}
