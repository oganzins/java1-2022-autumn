package lv.javaguru.training.lessons10;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {

    public static List<Integer> copy(List<Integer> source) {
       List<Integer> copy = new ArrayList<>();
       for (Integer element : source) {
           copy.add(element);
       }
       return copy;
    }

    public static List<Integer> reverse(List<Integer> source) {
        List<Integer> reveresedList = new ArrayList<>();
        for (int i = source.size() -1; i >= 0; i--){
            reveresedList.add(source.get(i));
        }
        return reveresedList;
    }

}

