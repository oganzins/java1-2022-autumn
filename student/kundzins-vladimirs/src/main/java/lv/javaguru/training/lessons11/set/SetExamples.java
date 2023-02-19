package lv.javaguru.training.lessons11.set;

import java.util.HashSet;
import java.util.Set;

public class SetExamples {

    public static void main(String[] args) {
        Set<String> countries = new HashSet<>();
        countries.add("Latvia");
        countries.add("Estonia");
        countries.add("Lithuania");
        countries.add("Latvia");
        countries.add("Latvia");

        countries.remove("Lithuania");

        System.out.println(countries);
        System.out.println(countries.size());
        System.out.println(countries.contains("Latvia"));
        System.out.println(countries.contains("Lithuania"));

        for(String country : countries){

        }
    }
}
