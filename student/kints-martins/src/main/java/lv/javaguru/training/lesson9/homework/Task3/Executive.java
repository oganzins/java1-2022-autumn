package lv.javaguru.training.lesson9.homework.Task3;

public class Executive extends SalariedEmployee {

    double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Executive(String firstName, String lastName, double salary, double bonus) {
        super(firstName, lastName, salary);
        this.bonus = bonus;
    }

    @Override
    public double pay() {
        double pay = getSalary() + bonus;
        return pay;
    }
}
