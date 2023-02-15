package lv.javaguru.training.lesson15.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Pear", "Banana", "Peach", "Pineapple", "Cherry");

        //Old way
        List<String> oldLowerCasedFruits = new ArrayList<>();
        for (String fruit : fruits) {
            if (fruit.startsWith("P")) {
                oldLowerCasedFruits.add(fruit.toUpperCase());
            }
        }

        System.out.println(oldLowerCasedFruits);

        //Stream way
        List<String> lowerCasedFruits = fruits.stream()
                .filter(fruit -> fruit.startsWith("P"))
                .map(fruit -> fruit.toUpperCase())
                .collect(Collectors.toList());


        System.out.println(lowerCasedFruits);
    }

}
