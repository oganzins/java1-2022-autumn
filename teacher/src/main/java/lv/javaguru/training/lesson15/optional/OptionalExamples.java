package lv.javaguru.training.lesson15.optional;

import java.util.Optional;

public class OptionalExamples {

    public static void main(String[] args) {
        Optional<Integer> optionalInteger = Optional.of(1);
        Optional<String> optionalFruit = Optional.of("Apple");

        Optional.ofNullable(getDay(1));
        Optional.ofNullable(getDay(2));
    }

    public static String getDay(int dayNumber) {
        if (dayNumber == 1) {
            return "Monday";
        } else {
            return null;
        }
    }

}
