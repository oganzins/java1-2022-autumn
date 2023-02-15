package lv.javaguru.training.lesson15.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SortedDemo {

    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Pear", "Banana", "Peach", "Banana", "Pineapple", "Cherry");

        List<String> alphabeticAscendingFruits = fruits.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(alphabeticAscendingFruits);

        List<String> alphabeticDescendingFruits = fruits.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(alphabeticDescendingFruits);

        Set<String> setOfFruits = fruits.stream()
                .filter(fruit -> fruit.startsWith("B"))
                .collect(Collectors.toSet());

        System.out.println(setOfFruits);
    }

}
