package lv.lv.javaguru.training.lesson7.homework;

public class CreditCard {

    private String name;
    private String number;
    private double balance = 0.00;
    private String pinCode;
    private int invalidPinCodeCounter = 0;
    private boolean active = true;
    private boolean authorized = false;

    public CreditCard(String name, String number, String pinCode, double balance) {
        this.name = name;
        this.number = number;
        this.pinCode = pinCode;
        this.balance = balance;
    }

    public CreditCard(String name, String number, String pinCode) {

        this(name, number, pinCode, 0.00);
    }

    public String getName() { return name; }

    public String getNumber() { return number; }

    public double getBalance() { return balance; }

    public boolean isActive() { return active; }

    public boolean isAuthorized() { return authorized; }


    public void login(String pinCode) {

        if (active && pinCode.equals(this.pinCode)) {
            authorized = true;
            invalidPinCodeCounter = 0;
        }

        if (!pinCode.equals(this.pinCode)) {
            invalidPinCodeCounter ++;
        }

        if (invalidPinCodeCounter >= 3) {
            active = false;
        }
    }

    public void logout() {
        authorized = false;
    }

    public void deposit(double amount) {
        if (!authorized) {
            balance = balance + amount;
        }
    }

    public void withdraw(double amount) {
        if (!authorized) {
            if (balance >= amount) {
                balance = balance - amount;
            }
        }
    }
}
