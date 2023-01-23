package lv.javaguru.training.lesson08.account;

import java.time.LocalDate;

public class CustomSavingsAccount extends SavingsAccount {

    private double interest;

    public CustomSavingsAccount(String accountNumber, LocalDate term, double interest) {
        super(accountNumber, term);
        this.interest = interest;
    }

    @Override
    public void recalculateInterestOfBalance() {
        if (term.isBefore(LocalDate.now())) {
            balance = balance + balance * interest;
        }
    }

    @Override
    public String toString() {
        return "CustomSavingsAccount{" +
                "interest=" + interest +
                ", term=" + term +
                ", balance=" + balance +
                "} " + super.toString();
    }
}
