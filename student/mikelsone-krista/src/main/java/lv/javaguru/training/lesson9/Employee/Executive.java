package lv.javaguru.training.lesson9.Employee;

public class Executive extends SalariedEmployee {
    private double bonus;

    public Executive(String firstName, String lastName, double salary, double bonus) {
        super(firstName, lastName, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double pay() {
        return getSalary() + bonus;
    }
}
