package lv.javaguru.training.lesson1;

import java.util.HashSet;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {
        Set<String> countries = new HashSet<>();
        countries.add("Latvia");
        countries.add("Estonia");
        countries.add("Denmark");

        for (String country: countries) {
            System.out.println(country);
        }
    }

}
