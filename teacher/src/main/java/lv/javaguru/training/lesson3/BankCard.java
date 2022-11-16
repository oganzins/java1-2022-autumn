package lv.javaguru.training.lesson3;

public class BankCard {

    String name;
    String number;
    String securityCode;

    BankCard() {
        name = "UNKNOWN";
        number = "1111111111111";
        securityCode = "000";
    }

    BankCard(String name) {
        this.name = name;
    }

    void printBalance() {

    }

    public static void main(String[] args) {
        BankCard card = new BankCard("OLEGS GANZINS");

        System.out.println("Card name " + card.name);

        BankCard otherCard = new BankCard();

        System.out.println("Other card name " + otherCard.name);
    }


}
