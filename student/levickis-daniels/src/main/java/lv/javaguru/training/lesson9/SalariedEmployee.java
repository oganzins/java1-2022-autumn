package lv.javaguru.training.lesson9;

public class SalariedEmployee extends Employee {


    public SalariedEmployee(String firstname, String lastname) {
        super(firstname, lastname);
    }

    @Override
    public double pay() {
        return salary;
    }


    private double salary;

    public SalariedEmployee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public int setSalary(int salary) {
        return salary;
    }

    public double getPay() {
        return salary;
    }


}























