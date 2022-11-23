package lv.javaguru.training.lesson4;

public class Person {

    private String name;
    private int age;

    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public boolean isAdult() {
        if (age > 17) {
            return true;
        }
        return false;
    }

    public boolean isAdultSimplified() {
        return age > 17;
    }

    public void printInfo() {
        System.out.println("Person name: " + name);
        if (age > 17) {
            System.out.println("Person can vote");
            System.out.println("Person is adult");
            if (age > 68) {
                System.out.println("Person is retired");
            }
        }
        if (age < 18) {
            System.out.println("Person can't vote");
            System.out.println("Person is underage");
        }
        System.out.println("Person's gender: " + gender);
    }

    public static void main(String[] args) {
        Person teacher = new Person("Oļegs Ganzins", 72, "Male");
        teacher.printInfo();

        System.out.println();

        Person randomChild = new Person("Jānis Bērziņš", 10, "Male");
        randomChild.printInfo();
    }

}
