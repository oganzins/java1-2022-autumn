package lv.javaguru.training.lesson12;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount() {
        balance = 0;
    }

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
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
                throw new WithdrawalAmountMustBePozitive (amount);
            } else {
                throw new NotEnoughFundsException(balance, amount);
            }
        }
    public double getBalance() {
        return balance;
    }
        }


