package lv.javaguru.training.lesson8.account;

import java.time.LocalDate;

public class BankAccountDemo {

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("8238232002389232", LocalDate.of(2022, 10, 10));
        savingsAccount.deposit(100);
        savingsAccount.deposit(1000);
        savingsAccount.recalculateInterestOfBalance();

        System.out.println(savingsAccount);

        savingsAccount.withdraw();

        System.out.println(savingsAccount);
        System.out.println();

        CheckingAccount checkingAccount = new CheckingAccount("123213123123123123123", 1000.00);
        checkingAccount.deposit(100);
        checkingAccount.withdraw(500);

        System.out.println(checkingAccount);

        CustomSavingsAccount customSavingsAccount
                = new CustomSavingsAccount("12321312312122", LocalDate.of(2022, 10, 10), 0.05);
        customSavingsAccount.deposit(1000);
        customSavingsAccount.deposit(1000);
        customSavingsAccount.recalculateInterestOfBalance();

        System.out.println(customSavingsAccount);

    }

}
