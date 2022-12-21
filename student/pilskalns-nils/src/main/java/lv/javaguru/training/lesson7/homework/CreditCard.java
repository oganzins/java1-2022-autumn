package lv.javaguru.training.lesson7.homework;

public class CreditCard {


    private String name;
    private String number;
    private Double balance = 0.00;
    private String pinCode;
    private int invalidPinCodeCounter = 0;
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
        this(name, number, pinCode, 0.00);
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isActive() {
        return active;
    }

    public boolean isAuthorized() {
        return authorized;
    }

    public void login(String pinCode) {
        if (active && pinCode.equals(this.pinCode)) {
            authorized = true;
        }
        if (pinCode.equals(this.pinCode)) {
            invalidPinCodeCounter = 0;
        }
        if (!pinCode.equals(this.pinCode)) {
            invalidPinCodeCounter++;
        }
        if (invalidPinCodeCounter >= 3) {
            active = false;
        }

    }

    public void logout() {
        authorized = false;
    }

    public void deposit(Double amount) {
        if (authorized & amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(Double amount) {
        if (authorized & balance >= amount) {
            balance -= amount;
        }
    }
}