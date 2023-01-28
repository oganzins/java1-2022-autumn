package lv.javaguru.training.lesson7.homework;

public class CreditCard {
    private String name;
    private String number;
    private double balance;
    private String pinCode;
    private int invalidPinCodeCounter = 0;
    private boolean active = true;
    private boolean authorized = false;

    public CreditCard(String name, String number, double balance, String pinCode) {
        this.name = name;
        this.number = number;
        this.balance = balance;
        this.pinCode = pinCode;
    }

    public CreditCard(String name, String number, String pinCode) {
        this(name, number, 0.00, pinCode);
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
        if (active == true && pinCode == this.pinCode) {
            authorized = true;
        }
        if (pinCode == this.pinCode) {
            invalidPinCodeCounter = 0;
        } else {
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
        if (authorized == true) {
            balance = balance + amount;
        }
    }

    public void withdraw(double amount) {
        if (authorized == true && balance >= amount) {
            balance = balance - amount;
        }
    }
}