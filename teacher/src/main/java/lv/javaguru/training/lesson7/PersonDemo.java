package lv.javaguru.training.lesson7;

import java.time.LocalDate;

public class PersonDemo {

    public static void main(String[] args) {
        Person person = new Person("Oļegs", "Ganzins", LocalDate.of(1985, 10, 6));

        System.out.println(person);
    }

}
