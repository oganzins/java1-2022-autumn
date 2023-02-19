package lv.javaguru.training.lessons3;

public class BankCard {

    String name;
    String number;
    String securityCode;

    BankCard(){
        name = "UNKNOWN";
        number= "1234567890";
        securityCode = "000";
    }

    BankCard(String name){
        this.name = name;
    }

    void printBalance() {
    }

    public static void main(String[] args) {
        BankCard myCard = new BankCard("Vladimirs Kundzins");

        System.out.println("Card name " +myCard.name);

        BankCard othetCard = new BankCard();

        System.out.println("Other card name " + othetCard.name);

            }
}

