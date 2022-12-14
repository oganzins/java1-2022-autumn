package homework;

public class Person {

    String firstName;
    String lastName;
    int age;

    Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        Person student = new Person("Atis", "Saicans",32);
String name = student.getName();
System.out.println(name);


    }
}
