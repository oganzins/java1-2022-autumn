package lv.javaguru.training.lesson2;

import java.awt.*;

public class Person {
    public static void main(String[] args) {
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
        
        
        public String getName() {
            returne firstName + " " + lastName;
            
        }
        public static void main(String[] args) {
            Person student = new Person("Elvijs", "Briņķis", 37);
            System.out.println(student.getFirstName());
            student.setFirstName("Elvijs");
        }

        {

        }
    }

    private boolean getFirstName() {
        return false;
    }
}
