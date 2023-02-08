package lv.javaguru.training.lesson14.generics;

import java.util.Collection;

public class CatalogDemo {

    public static void main(String[] args) {
        Catalog<Person> personCatalog = new Catalog<>();

        personCatalog.add(new Person("John", "Doe"));
        Collection<Person> persons = personCatalog.getAllItems();

        System.out.println(persons);

        Catalog<Product> productCatalog = new Catalog<>();
        productCatalog.add(new Product("Bread", 2.30));

        System.out.println(productCatalog.getAllItems());
    }

}
