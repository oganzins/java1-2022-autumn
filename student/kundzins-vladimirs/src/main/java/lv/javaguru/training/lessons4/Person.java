package lv.javaguru.training.lessons4;

public class Person {


    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public boolean isAdult(){
        if (age > 17){
            return true;
        }
        return false;
    }
    public boolean isAdultSimplfied(){
        return age > 17;
    }
    public void printInfo(){
        System.out.println("Person name: " +name);
        if (age > 17){
            System.out.println("Person can vote");
            System.out.println("Persin is adult");
        }
        if (age <18){

        System.out.println("Person can't vote");
        System.out.println("Person is underage");
    }


        System.out.println("Person's gender: " +gender);
    }

    public static void main(String[] args) {
        Person teachers = new Person("Olegs Ganzins", 37, "Male");
        teachers.printInfo();

        System.out.println();

        Person randomChild = new Person("Janis Berzins", 10, "Male");
        randomChild.printInfo();

       /* Person underagePerson = new Person(12);
       System.out.println(underagePerson.isAdult());
        System.out.println(underagePerson.isAdultSimplfied());

        Person adultPerson = new Person(18);
        System.out.println(adultPerson.isAdult());
        System.out.println(adultPerson.isAdultSimplfied()); */
    }
}
