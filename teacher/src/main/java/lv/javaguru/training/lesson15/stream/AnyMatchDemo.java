package lv.javaguru.training.lesson15.stream;

import java.util.List;

public class AnyMatchDemo {

    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Pear", "Banana", "Peach", "Pineapple", "Cherry");

        boolean hasFruitNameLargerThanEightSymbols = fruits.stream()
                .anyMatch(fruit -> fruit.length() >= 8);

        System.out.println(hasFruitNameLargerThanEightSymbols);

        boolean containsStrawberry = fruits.stream()
                .anyMatch(fruit -> "Strawberry".equals(fruit));

        System.out.println(containsStrawberry);

    }


}
