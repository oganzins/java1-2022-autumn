package lv.javaguru.training.lesson7.homework;

public class CreditCard {



    private String name;
    private String number;
    private double balance = 0.00;
    private String pinCode;
    private int invalidPinCodeCounter = 0;
    private boolean active;
    private boolean authorized;


    public CreditCard(String name, String number, String pinCode, double balance){
        this.name = name;
        this.number = number;
        this.pinCode = pinCode;
        this.balance = balance;
    }

    public CreditCard(String name, String number, String pinCode){
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
        active = true;
        return true;
    }

    public boolean isAuthorized() {
        authorized = false;
         return false;
    }

    public void login(String pinCode){
        if(isActive() && pinCode == this.pinCode){
           authorized = true;
        }
        if (pinCode == this.pinCode){
            invalidPinCodeCounter = 0;
        }
        if(pinCode != this.pinCode){
            invalidPinCodeCounter ++;
        }
        if(invalidPinCodeCounter >= 3){
            active = false;
        }
    }
    public void logout(){
        authorized = false;
    }

    public void deposit(double amount){
        if(authorized){
            balance += amount;
        }
    }
    public void withdraw(double amount){
        if(authorized && balance >= amount){
            balance -= amount;
        }
    }

}
