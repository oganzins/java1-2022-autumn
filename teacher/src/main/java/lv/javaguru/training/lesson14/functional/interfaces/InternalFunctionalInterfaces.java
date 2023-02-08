package lv.javaguru.training.lesson14.functional.interfaces;

import java.util.function.*;

public class InternalFunctionalInterfaces {

    public static void main(String[] args) {
        Consumer<String> stringPrinter = value -> System.out.println(value);
        stringPrinter.accept("Hello world!");

        Supplier<String> helloWolrdSupplier = () -> "Hello World!";
        String greeting = helloWolrdSupplier.get();
        System.out.println(greeting);

        Function<String, Integer> toInteger = stringValue -> Integer.valueOf(stringValue);
        Integer numericValue = toInteger.apply("123456");
        System.out.println(numericValue);

        Predicate<Integer> isOddNumber = number -> number % 2 != 0;

        BiFunction<String, String, String> concatenate = (beginning, end) ->  beginning + end;
    }

}
