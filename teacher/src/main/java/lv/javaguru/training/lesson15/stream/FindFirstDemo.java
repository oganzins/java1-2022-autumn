package lv.javaguru.training.lesson15.stream;

import java.util.List;
import java.util.Optional;

public class FindFirstDemo {

    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Pear", "Banana", "Peach", "Pineapple", "Cherry");

        String fruitName = fruits.stream()
                .filter(fruit -> fruit.startsWith("P"))
                .findFirst()
                .orElse("FRUIT NOT FOUND");

        System.out.println(fruitName);

        fruitName = fruits.stream()
                .filter(fruit -> fruit.startsWith("P"))
                .findAny()
                .orElse("FRUIT NOT FOUND");

        System.out.println(fruitName);

        fruitName = fruits.stream()
                .filter(fruit -> fruit.startsWith("Z"))
                .findFirst()
                .orElse("FRUIT NOT FOUND");

        System.out.println(fruitName);

    }

}
