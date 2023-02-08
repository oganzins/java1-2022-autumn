package lv.javaguru.training.lesson14.nested;

public class PersonDemo {

    public static void main(String[] args) {
        Person person = new SimplePerson("John", "Doe");
        String fullName = person.getFirstName() + person.getLastName();

        SimplePerson otherPerson = new SimplePerson("Jane", "Smith");
        System.out.println(otherPerson.getFullname().get());
    }

}
