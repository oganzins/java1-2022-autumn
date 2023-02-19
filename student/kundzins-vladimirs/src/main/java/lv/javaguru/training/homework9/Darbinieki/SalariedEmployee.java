package lv.javaguru.training.homework9.Darbinieki;

public class SalariedEmployee extends Employee{

    private double salary;

    public SalariedEmployee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double pay() {
        return getSalary();
    }
}
