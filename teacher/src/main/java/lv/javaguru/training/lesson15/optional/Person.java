package lv.javaguru.training.lesson15.optional;

import java.util.Objects;
import java.util.Optional;

public class Person {

    private String firstName;
    private String lastName;
    private Address address;

    public Person(String firstName, String lastName) {
        this(firstName, lastName, null);
    }

    public Person(String firstName, String lastName, Address address) {
        this.firstName = Optional.ofNullable(firstName).orElseThrow(() -> new NullPointerException());
        this.lastName = Objects.requireNonNull(lastName);
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Optional<Address> getAddress() {
        return Optional.ofNullable(address);
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

}
