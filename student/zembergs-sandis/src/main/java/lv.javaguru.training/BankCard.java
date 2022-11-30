package lv.javaguru.training;

/*
    Homework accepted
 */
public class BankCard {

    String name;
    String number;
    String securityCode;

    BankCard() {
        name = "UNKNOWN";
        number = "11111111";
        securityCode = "222";

    }

    BankCard(String name) {
        this.name = name;
    }

    void printBalance() {

    }

    public static void main(String[] args) {
        BankCard card = new BankCard("Sandis Zembergs");

        System.out.println("Card name -" + card.name);

        BankCard otherCard = new BankCard();

        System.out.println("other card name -" + otherCard.name);
    }
}
