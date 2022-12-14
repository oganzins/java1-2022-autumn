package lv.javaguru.training.lesson7;

import java.math.BigDecimal;

public class BankAccount {

    private String owner;
    private BigDecimal balance;

    public BankAccount(String owner, BigDecimal balance) {
        this.owner = owner;
        setBalance(balance);
    }

    public String getOwner() {
        return owner;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void deposit(BigDecimal amount) {
        if (isPositive(amount)) {
            balance = balance.add(amount);
        }

    }

    public void withdraw(BigDecimal amount) {
        if (isPositive(amount) && balance.compareTo(amount) > 0) {
            balance = balance.subtract(amount);
        }
    }

    private void setBalance(BigDecimal balance) {
        if (balance.compareTo(BigDecimal.ZERO) < 0) {
            this.balance = BigDecimal.ZERO;
        } else {
            this.balance = balance;
        }
    }

    private boolean isPositive(BigDecimal amount) {
        return amount.compareTo(BigDecimal.ZERO) > 0;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "owner='" + owner + '\'' +
                ", balance=" + balance +
                '}';
    }
}
