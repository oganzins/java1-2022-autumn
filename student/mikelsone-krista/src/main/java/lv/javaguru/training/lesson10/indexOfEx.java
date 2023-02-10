package lv.javaguru.training.lesson10;

import java.util.ArrayList;
import java.util.List;

public class indexOfEx {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>();
        books.add("The catcher in the Rye");
        books.add("Twisted game");

        int size = books.size();
        System.out.println("list size is " + size);
    }
}
