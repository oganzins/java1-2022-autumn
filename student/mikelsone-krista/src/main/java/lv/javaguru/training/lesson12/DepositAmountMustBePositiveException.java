package lv.javaguru.training.lesson12;

public class DepositAmountMustBePositiveException extends BankAccountException  {
    public DepositAmountMustBePositiveException(double depositAmount) {
        super("Noguldījuma summai ir jābūt lielākai par 0.00 (noguldāmā summa: " +
                +depositAmount
                + ")!");
    }
}
