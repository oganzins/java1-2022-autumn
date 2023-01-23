package lv.javaguru.training.lesson08.account;

import java.time.LocalDate;

public class SavingsAccount extends BankAccount {

    protected LocalDate term;

    public SavingsAccount(String accountNumber, LocalDate term) {
        super(accountNumber, 0.0);
        this.term = term;
    }

    public void withdraw() {
        if (term.isBefore(LocalDate.now())) {
            balance = 0;
        }
    }

    public void recalculateInterestOfBalance() {
        if (term.isBefore(LocalDate.now())) {
            balance *= 1.2;
        }
    }

    @Override
    public double getBalance() {
        return balance;

    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "term=" + term +
                ", balance=" + balance +
                "} " + super.toString();
    }
}
