package lv.javaguru.training.lesson13;

import java.util.List;

public class StringUtils {

    public static String concat(String first, String second) {
        return first + second;
    }

    public static boolean isEmpty(String value) {
        return value.isEmpty();
    }

    public static String concat(List<String> parts) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String part : parts) {
            stringBuilder.append(part);
        }
        return stringBuilder.toString();
    }


}
