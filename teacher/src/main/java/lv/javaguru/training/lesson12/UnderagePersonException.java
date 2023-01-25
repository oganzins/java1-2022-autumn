package lv.javaguru.training.lesson12;

public class UnderagePersonException extends RuntimeException {

    public UnderagePersonException(Person person) {
        super("Person is under age: " + person);
    }

}
