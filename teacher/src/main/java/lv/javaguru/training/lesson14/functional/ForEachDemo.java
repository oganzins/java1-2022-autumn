package lv.javaguru.training.lesson14.functional;

import java.util.List;

public class ForEachDemo {

    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Pineapple", "Peach", "Pear");

        for (String fruit : fruits) {
            String upperCaseFruit = fruit.toUpperCase();
            System.out.println(upperCaseFruit);
        }

        System.out.println();

        fruits.forEach(fruit -> {
            String upperCaseFruit = fruit.toUpperCase();
            System.out.println(upperCaseFruit);
        });
    }

}
