package lv.javaguru.training.lesson14.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Catalog<T> {

    private List<T> items;

    public Catalog() {
        items = new ArrayList<T>();
    }

    public void add(T item) {
        items.add(item);
    }

    public Collection<T> getAllItems() {
        return items;
    }

    public void remove(T item) {
        items.remove(item);
    }


}
