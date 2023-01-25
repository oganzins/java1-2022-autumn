package lv.javaguru.training.lesson12;

public class PersonValidatorDemo {

    public static void main(String[] args) {
        Person person = new Person("Oļegs", "Ganzins", 37);
        PersonValidator.validate(person);

        Person underAgePerson = new Person("Jānis", "Bērziņš", 16);
        PersonValidator.validate(underAgePerson);
    }

}
