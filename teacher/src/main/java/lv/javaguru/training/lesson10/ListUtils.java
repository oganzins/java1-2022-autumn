package lv.javaguru.training.lesson10;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {

    public static void main(String[] args) {
        List<Integer> first = new ArrayList<>();
        first.add(1);
        first.add(2);
        first.add(3);
        first.add(4);
        first.add(5);

        List<Integer> second = new ArrayList<>();
        second.add(1);
        second.add(2);
        second.add(3);
        second.add(4);
        second.add(5);

        System.out.println(ListUtils.isEqual(first, second));
    }

    public static List<Integer> copy(List<Integer> source) {
        List<Integer> copy = new ArrayList<>();
        for (Integer element : source) {
            copy.add(element);
        }
        return copy;
    }

    public static List<Integer> reverse(List<Integer> source) {
        List<Integer> reveresedList = new ArrayList<>();
        for (int i = source.size() - 1; i >= 0; i--) {
            reveresedList.add(source.get(i));
        }
        return reveresedList;
    }

    public static List<Integer> combine(List<Integer> first, List<Integer> second) {
        List<Integer> mergedList = new ArrayList<>();
        for (Integer element : first) {
            mergedList.add(element);
        }
        for (Integer element : second) {
            mergedList.add(element);
        }
        return mergedList;
    }

    public static boolean isEqual(List<Integer> first, List<Integer> second) {
        boolean equals = true;
        if (first.size() == second.size()) {
            for (int i = 0; i < first.size(); i++) {
                if (!first.get(i).equals(second.get(i))) {
                    equals = false;
                    break;
                }
            }
        } else {
            equals = false;
        }
        return equals;
    }

}
