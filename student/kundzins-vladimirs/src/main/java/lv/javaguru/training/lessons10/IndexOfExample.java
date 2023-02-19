package lv.javaguru.training.lessons10;

import java.util.ArrayList;
import java.util.List;

public class IndexOfExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Jānis");
        names.add("Pēteris");
        names.add("Dace");
        names.add("Pēteris");

        System.out.println(names.indexOf("Pēteris"));


    }
}
