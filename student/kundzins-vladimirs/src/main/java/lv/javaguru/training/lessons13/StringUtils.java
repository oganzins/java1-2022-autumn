package lv.javaguru.training.lessons13;

import java.util.List;

public class StringUtils {

    public static String contact(String first, String second){
        return first + second;
    }

    public static boolean isEmpty(String value){
        return value.isEmpty();

    }

    public static String concat(List<String> parts){
        String value = "";
        for (String part : parts){
            value += part;
        }
        return value;
    }
}
