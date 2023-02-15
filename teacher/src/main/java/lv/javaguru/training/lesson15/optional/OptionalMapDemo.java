package lv.javaguru.training.lesson15.optional;

import lv.javaguru.training.lesson14.functional.Function;

import java.util.Optional;

public class OptionalMapDemo {

    public static void main(String[] args) {
        Person person = new Person("Dave", "Brown", new Address("Latvia", null, null));

        //Old way
        if (person.getAddress().isPresent()) {
            Address address = person.getAddress().get();
            System.out.println(address.getCountry());
        }

        Optional<Address> optionalAddress = person.getAddress();
        Optional<String> optionalCountry = optionalAddress.map(address -> address.getCountry());
        optionalCountry.ifPresent(country -> System.out.println(country));

        person.getAddress()
                .map(address -> address.getCountry())
                .ifPresent(country -> System.out.println(country));
    }

}
