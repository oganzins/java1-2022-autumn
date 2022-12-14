package lv.javaguru.training.lesson7;

import java.time.LocalDate;
import java.util.Objects;

public class Person {

    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public Person(String firstName, String lastName, LocalDate birthDate) {
        setFirstName(firstName);
        setLastName(lastName);
        setBirthDate(birthDate);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        LocalDate now = LocalDate.now();

        int age = now.getYear() - birthDate.getYear();
        if (!hadBirthDayThisYear() && age > 0) {
            age -= 1;
        }

        return age;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName.toUpperCase();
    }

    public void setBirthDate(LocalDate birthDate) {
        LocalDate now = LocalDate.now();
        if (now.isBefore(birthDate)) {
            this.birthDate = now;
        } else {
            this.birthDate = birthDate;
        }
    }

    private boolean hadBirthDayThisYear() {
        LocalDate now = LocalDate.now();
        return now.getMonthValue() > birthDate.getMonthValue()
                || (now.getMonthValue() == birthDate.getMonthValue() && now.getDayOfMonth() > birthDate.getDayOfMonth());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(birthDate, person.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthDate);
    }
    
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

}
