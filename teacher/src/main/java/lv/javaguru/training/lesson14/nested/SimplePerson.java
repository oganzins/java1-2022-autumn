package lv.javaguru.training.lesson14.nested;

public class SimplePerson implements Person {

    private String firstName;
    private String lastName;

    public SimplePerson(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    public FullName getFullname() {
        return new FullName(firstName, lastName);
    }

    public class FullName {

        private String firstName;
        private String lastName;

        private FullName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String get() {
            return firstName + lastName;
        }

    }
}
