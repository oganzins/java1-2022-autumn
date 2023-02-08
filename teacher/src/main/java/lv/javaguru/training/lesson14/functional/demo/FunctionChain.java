package lv.javaguru.training.lesson14.functional.demo;


import java.util.function.Function;

public class FunctionChain {

    public static void main(String[] args) {
        Function<String, String> toUpperCase = value -> value.toUpperCase();
        Function<String, String> reverse = value -> {
            StringBuilder builder = new StringBuilder(value);
            return builder.reverse().toString();
        };
        Function<String, String> removeVowels = value -> {
            return value.replaceAll("A", "")
                    .replaceAll("E", "")
                    .replaceAll("I", "")
                    .replaceAll("O", "")
                    .replaceAll("U", "");
        };

        Function<String, String> toUppercaseThenReverseThenRemoveVowels =
                toUpperCase.andThen(reverse).andThen(removeVowels);

        String processedValue = toUppercaseThenReverseThenRemoveVowels.apply("Fruit");

        System.out.println(processedValue);
    }
}
