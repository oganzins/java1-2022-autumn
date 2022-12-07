package lv.javaguru.training.lesson6;

import java.util.Arrays;

public class ArrayAddValue {

    public static void main(String[] args) {
        String[] textArray = {"A", "B", "C", "D"};
        String[] result = addValueToArray(textArray, "E");

        String arrayStringRepresentation = Arrays.toString(result);
        System.out.println(arrayStringRepresentation);


        System.out.println(Arrays.toString(addValueToArray(null, "E")));
    }

    public static String[] addValueToArray(String[] values, String value) {
        if (values != null) {
            String[] extendedArray = new String[values.length + 1];

            for (int i = 0; i < values.length; i++) {
                extendedArray[i] = values[i];
            }

            extendedArray[values.length] = value;
            return extendedArray;
        } else {
            return new String[] {value};
        }

    }

}
