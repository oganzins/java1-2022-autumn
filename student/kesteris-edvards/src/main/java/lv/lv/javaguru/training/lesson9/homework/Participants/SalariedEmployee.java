package lv.lv.javaguru.training.lesson9.homework.Participants;

public class SalariedEmployee extends Employee {

    double salary;


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
        return salary;
    }
}
