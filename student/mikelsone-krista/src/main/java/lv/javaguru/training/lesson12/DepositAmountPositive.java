package lv.javaguru.training.lesson12;

public class DepositAmountPositive extends RuntimeException{
    public DepositAmountPositive(double depositAmount){
        super("Var noguldit tikai poitivu summu(summa bija:" + depositAmount);
    }

}
