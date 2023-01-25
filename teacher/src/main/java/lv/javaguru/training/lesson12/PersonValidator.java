package lv.javaguru.training.lesson12;

public class PersonValidator {

    public static void validate(Person person) {
        if (person.getAge() < 18) {
            throw new UnderagePersonException(person);
        }
    }

}
