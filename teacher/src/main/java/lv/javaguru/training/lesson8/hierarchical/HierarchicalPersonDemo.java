package lv.javaguru.training.lesson8.hierarchical;

public class HierarchicalPersonDemo {

    public static void main(String[] args) {
        Person person = new Person("Oļegs", "Ganzins");
        System.out.println(person);
        System.out.println();

        Employee employee = new Employee("Jānis", "Bērziņš", "Programmētājs");
        System.out.println(employee);
        System.out.println();

        Customer customer = new Customer("Dace", "Kļaviņa", 20);
        System.out.println(customer);
        System.out.println();

        Teacher teacher = new Teacher("Raitis", "Kalniņš", "Matemātika");
        System.out.println(teacher);
        System.out.println();

        Person employeePerson = new Employee("Jānis", "Bērziņš", "Programmētājs");
        Person customerPerson = new Customer("Dace", "Kļaviņa", 20);
        Person teacherPerson = new Teacher("Raitis", "Kalniņš", "Matemātika");
    }

}
