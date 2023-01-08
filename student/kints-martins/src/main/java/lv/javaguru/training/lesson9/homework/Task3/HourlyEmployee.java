package lv.javaguru.training.lesson9.homework.Task3;

public class HourlyEmployee extends Employee {

    double hoursWorked;
    double payRate;

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

    public HourlyEmployee(String firstName, String lastName, double hoursWorked, double payRate) {
        super(firstName, lastName);
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    @Override
    public double pay() {
        double pay = hoursWorked * payRate;
        return pay;
    }
}
