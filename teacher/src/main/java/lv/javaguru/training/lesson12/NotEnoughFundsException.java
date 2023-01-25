package lv.javaguru.training.lesson12;

public class NotEnoughFundsException extends BankAccountException {

    public NotEnoughFundsException(double balance, double withdrawalAmount) {
        super("Bankas kontā nepietiek naudas " +
                "(bilance: " + balance + ", pieprasītā summa: " + withdrawalAmount + ")!");
    }

}
