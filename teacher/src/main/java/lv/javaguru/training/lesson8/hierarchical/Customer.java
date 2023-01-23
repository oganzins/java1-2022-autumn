package lv.javaguru.training.lesson8.hierarchical;

public class Customer extends Person {

    private int age;

    public Customer(String firstName, String lastName, int age) {
        super(firstName, lastName);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "age=" + age +
                "} " + super.toString();
    }
}
