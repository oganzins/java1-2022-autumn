package lv.javaguru.training.lesson9.Employees;

public class HourlyEmployee extends Employee {

    private int hoursWorked;
    private double payRate;

    public HourlyEmployee (String firstName, String lastName, int hoursWorked, double payRate) {
        super (firstName, lastName);
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
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
