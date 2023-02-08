package lv.javaguru.training.lesson14.functional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {


    public static void main(String[] args) {
        Integer[] numberArray = {4, 5, 9, 1, -1, 111, -9000};
        List<Integer> numbers = Arrays.asList(numberArray);

        //numbers.sort(createIntegerComparator());
        numbers.sort((first, second) -> first.compareTo(second));

        System.out.println(numbers);
    }


    private static Comparator<Integer> createIntegerComparator() {
        return new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
    }
}
