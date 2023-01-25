package lv.javaguru.training.lesson12;

public class BankAccountDemo {

    public static void main(String[] args) {
        try {
            BankAccount bankAccount = new BankAccount();
            bankAccount.withdraw(-100);
            System.out.println(bankAccount.getBalance());
        } catch (BankAccountException e) {
            System.out.println(e.getMessage());
        }
    }

}
