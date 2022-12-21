package lv.javaguru.training.lesson08.inheritance.account;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "balance=" + balance +
                "} " + super.toString();
    }
}

