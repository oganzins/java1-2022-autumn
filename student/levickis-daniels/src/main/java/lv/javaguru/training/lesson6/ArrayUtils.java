package lv.javaguru.training.lesson6;

import java.util.Arrays;

public class ArrayUtils {

    int[] copy(int[] sourceArray){
        int[]copy = new int[sourceArray.length];
        for (int i =0; i< sourceArray.length; i++) {
            copy[i] = sourceArray[i];
         }


        return copy;
    }

    public int [] reverse (int[] sourceArray){
        int[]reverseArray = new int[sourceArray.length];
        for (int i=0; i<sourceArray.length;i++){
            reverseArray[sourceArray.length-1-i] = sourceArray[i];
        }
        return reverseArray;

    }

}
