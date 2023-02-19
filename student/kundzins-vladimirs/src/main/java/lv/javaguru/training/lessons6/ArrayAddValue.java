package lv.javaguru.training.lessons6;

import java.util.Arrays;

public class ArrayAddValue {
    public static void main(String[] args) {

        String[] textArray = {"A", "B", "C", "D"};
        String[] result = addValueToArray(textArray, "E");

        System.out.println(Arrays.toString(result));
    }

    public static String[] addValueToArray(String[] values, String value) {
        String[] extendedArray = new String[values.length + 1];

        for (int i = 0; i < values.length; i++) {
            extendedArray[i] = values[i];
        }
        return extendedArray;
    }
}
