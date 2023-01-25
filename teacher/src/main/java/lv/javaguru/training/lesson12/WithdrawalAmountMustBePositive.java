package lv.javaguru.training.lesson12;

public class WithdrawalAmountMustBePositive extends BankAccountException {

    public WithdrawalAmountMustBePositive(double amount) {
        super("Izņemtai summai ir jābūt pozitīvai (pieprasītā summa: " + amount + ")!");
    }

}
