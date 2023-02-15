package lv.javaguru.training.lesson15.reference;

import java.util.function.BiFunction;

public class StaticMethodReferenceDemo {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;

        BiFunction<Integer, Integer, Integer> sumUsingIntegerSum = (a, b) -> Integer.sum(a, b);

        BiFunction<Integer, Integer, Integer> sumMethodReference = Integer::sum;
    }


}
