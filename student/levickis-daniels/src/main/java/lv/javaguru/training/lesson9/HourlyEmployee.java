package lv.javaguru.training.lesson9;

public class HourlyEmployee extends Employee {

    private double hoursWorked;
    private double payRate;

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double setHoursWorked(double hoursWorked) {
        return hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public double setPayRate(double payRate) {
        return payRate;
    }


    public HourlyEmployee(String firstname, String lastname, double hoursWorked, double payRate) {
        super(firstname, lastname);
        this.payRate = payRate;
        this.hoursWorked=hoursWorked;

    }

    @Override
    public double pay() {
        return payRate*hoursWorked;
    }
}
