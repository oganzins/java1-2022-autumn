package lv.javaguru.training.lesson08.inheritance.single;

public class EmployeeDemo {

    public static void main(String[] args) {
        Person person = new Person("Oļegs", "Ganzins", 37);
        System.out.println(person);

        Employee employee = new Employee("Jānis", "Bērziņš", 25, "Programmētājs", "IT nodaļa");
        System.out.println(employee);

        Person otherPerson = new Employee("Dace", "Kļaviņa", 30, "Vadītājs", "IT nodaļa");
        System.out.println(otherPerson);
    }

}
