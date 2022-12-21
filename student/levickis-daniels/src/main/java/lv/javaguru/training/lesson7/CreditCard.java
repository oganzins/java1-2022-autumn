package lv.javaguru.training.lesson7;

public class CreditCard {

    private String name;
    private String number;
    private double balance;
    private String pinCode;
    private int invalidPinCodeCounter;
    boolean active =true;
    boolean authorized=true;


    public CreditCard(String name, String number, String pinCode, double balance) {
        this.name = name;
        this.number = number;
        this.pinCode = pinCode;
        this.balance = balance;
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

    public boolean isActive() {
        return active;
    }

    public boolean isAuthorized() {
        return authorized;
    }

    public void login(String pinCode) {
        if (isActive() == true && pinCode == this.pinCode) {

            authorized = true;
        } else authorized = false;

        if (pinCode == this.pinCode) {
            invalidPinCodeCounter = 0;


        } else invalidPinCodeCounter += 0;
        if (invalidPinCodeCounter == 3) {
            active = false;

        }
    }


    public void logout() {
        authorized = false;


    }

    public void deposit(double amount) {
        if (authorized == true) {
            amount = amount + balance;

        } else amount = amount;

    }

    public void withdraw(double amount) {
        if (authorized == true && balance > amount) {
            balance = balance - amount;

        }

    }

    public double getBalance() {
        return balance;
    }

}