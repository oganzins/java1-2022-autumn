package lv.javaguru.training.lesson2;

public class BankCard {


    String name;
    String number;
    String securityCode;

    BankCard() {
        name = "UNKNOWN";
        number = "11111111";
        securityCode = "000";
    }


    BankCard(String name) {
        this.name = name;
    }


    public static void main(String[] args) {

    }


}
