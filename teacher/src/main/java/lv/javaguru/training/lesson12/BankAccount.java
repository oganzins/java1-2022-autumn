package lv.javaguru.training.lesson12;

public class BankAccount {

    private double balance;

    public BankAccount() {
        balance = 0;
    }

    public void deposit(double amount) throws DepositAmountMustBePositiveException {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new DepositAmountMustBePositiveException(amount);
        }
    }

    public void withdraw(double amount) throws WithdrawalAmountMustBePositive, NotEnoughFundsException {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else if (amount <= 0) {
            throw new WithdrawalAmountMustBePositive(amount);
        } else {
            throw new NotEnoughFundsException(balance, amount);
        }
    }

    public double getBalance() {
        return balance;
    }

}
