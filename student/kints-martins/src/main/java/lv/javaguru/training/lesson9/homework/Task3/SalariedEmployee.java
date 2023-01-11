package lv.javaguru.training.lesson9.homework.Task3;

public class SalariedEmployee extends Employee {

    double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public SalariedEmployee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    @Override
    public double pay() {
        return salary;
    }
}
