package lv.javaguru.training.lesson7;

import java.math.BigDecimal;

public class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Oļegs Ganzins", BigDecimal.valueOf(100.00));
        bankAccount.withdraw(BigDecimal.valueOf(15.54));

        System.out.println(bankAccount);
    }

}
