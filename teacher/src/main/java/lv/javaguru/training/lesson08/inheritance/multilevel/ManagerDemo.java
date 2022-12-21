package lv.javaguru.training.lesson08.inheritance.multilevel;

public class ManagerDemo {

    public static void main(String[] args) {
        Person person = new Person("Oļegs", "Ganzins");
        System.out.println(person);

        Employee employee = new Employee("Jānis", "Bērziņš", "Programmētājs");
        System.out.println(employee);

        Manager manager = new Manager("Dace", "Kļaviņa", "IT Nodaļa");
        System.out.println(manager);

        Person managerPerson = new Manager("Dace", "Kļaviņa", "IT Nodaļa");
        Employee managerEmployee = new Manager("Dace", "Kļaviņa", "IT Nodaļa");

        Person employeePerson = new Employee("Jānis", "Bērziņš", "Programmētājs");
    }

}
