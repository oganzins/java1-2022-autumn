package lv.javaguru.training.lesson3;

public class Person {

    String firstName;
    String lastName;
    int age;

    Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public static void main(String[] args) {
        Person teacher = new Person("Oļegs", "Ganzins", 37);
        System.out.println(teacher.getFirstName());
        teacher.setFirstName("Andris");
        System.out.println(teacher.getFirstName());
    }

}
