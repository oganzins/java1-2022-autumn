package lv.javaguru.training.lesson15.optional;

import java.util.Optional;
import java.util.function.Consumer;

public class PersonDemo {

    public static void main(String[] args) {
        Person johnDoe = new Person("John", "Doe", new Address("Latvia", "LV1001", "Terbatas 65 - 34, Riga"));
        Person janeSmith = new Person("Jane", "Smith");

        sendPostalNotification(johnDoe);
        sendPostalNotification(janeSmith);
        sendPostalNotification(null);
    }

    private static void sendPostalNotification(Person person) {
        Optional<Person> optionalPerson = Optional.ofNullable(person);
        optionalPerson.map(Person::getAddress)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .ifPresent(address -> {
                    System.out.println("Triggering postal notification for " + person.getFullName());
                    System.out.println("Notification will be delivered to address: " + address);
                });
    }

}
