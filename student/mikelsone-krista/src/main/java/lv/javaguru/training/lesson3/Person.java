package lv.javaguru.training.lesson3;

public class Person {
    String  firstName;
    String lastName;
    int age;

    Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
     public void setFirstName(String firstName){
        this.firstName = firstName;
     }


    public String getName(){
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        Person teacher = new Person("Krista", "Mikelsone", 18 );
        System.out.println (teacher.setFirstName());
        teacher.setFirstName("Inga");
        System.out.println (teacher.setFirstName());

    }
}
