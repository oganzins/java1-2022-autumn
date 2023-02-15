package lv.javaguru.training.lesson15.stream;

import java.util.List;

public class ReduceDemo {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 4, 9, -10, 1, -100);
        Integer sumOfPositiveNumbers = numbers.stream()
                .filter(number -> number > 0)
                .reduce(0, Integer::sum);

        System.out.println(sumOfPositiveNumbers);
    }

}
