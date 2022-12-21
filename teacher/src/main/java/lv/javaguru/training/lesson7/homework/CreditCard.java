package lv.javaguru.training.lesson7.homework;

public class CreditCard {

    private String name;
    private String number;
    private Double balance;
    private String pinCode;
    private int invalidPinCodeCounter;
    private boolean active;
    private boolean authorized;

    public CreditCard(String name, String number, String pinCode, double balance) {
        this.name = name;
        this.number = number;
        this.pinCode = pinCode;
        this.balance = balance;
        this.active = true;
    }

    public CreditCard(String name, String number, String pinCode) {
        this(name, number, pinCode, 0.0);
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public boolean isActive() {
        return active;
    }

    public boolean isAuthorized() {
        return authorized;
    }

    public double getBalance() {
        return balance;
    }

    public void login(String pinCode) {
        if (active && this.pinCode.equals(pinCode)) {
            authorized = true;
            invalidPinCodeCounter = 0;
        } else if (!this.pinCode.equals(pinCode)) {
            invalidPinCodeCounter++;
        }
        if (invalidPinCodeCounter >= 3) {
            active = false;
        }
    }

    public void logout() {
        authorized = false;
    }

    public void deposit(double amount) {
        if (authorized) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (authorized && balance >= amount) {
            balance -= amount;
        }
    }

}
