package lv.javaguru.training.lesson9.homework.persons;

public class HourlyEmployee extends Employee{

    private double hoursWorked;
    private double payRate;

    public HourlyEmployee(String firstName, String lastName,double hoursWorked,double payRate) {
        super(firstName, lastName);
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    @Override
    public double pay() {
        return hoursWorked * payRate;
    }
}
