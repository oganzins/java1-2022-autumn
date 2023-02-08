package lv.javaguru.training.lesson14.nested;

public class AnonymousClassDemo {

    public static void main(String[] args) {
        Person anonymousPerson = createPerson("John", "Doe");
    }

    private static Person createPerson(String firstName, String lastName) {
        return new Person() {
            @Override
            public String getFirstName() {
                return firstName;
            }

            @Override
            public String getLastName() {
                return lastName;
            }
        };
    }

}
