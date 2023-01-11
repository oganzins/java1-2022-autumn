package lv.javaguru.training.lesson9;

public class Executive extends SalariedEmployee {


    public Executive(String firstname, String lastname) {
        super(firstname, lastname);
    }

    public Executive(String firstName, String lastName, int salary, int bonus) {
        super(firstName, lastName, salary);
        this.bonus=bonus;
    }

    private int bonus;
    public int getBonus() {
        return bonus;
    }

    public int setBonus(int bonus) {
        return bonus;

    }

    @Override
    public double pay() {
        return super.getSalary()+bonus;
    }
}
