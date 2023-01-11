package lv.javaguru.training.lesson9.abstraction.person;

public class PersonDemo {

    public static void main(String[] args) {
        Employee employee = new Employee("Oļegs", "Ganzins", 37, "Teacher");
        System.out.println(employee);

        Customer customer = new Customer("Jānis", "Bērziņš", 25, "Latvia");
        System.out.println(customer);
    }

}
