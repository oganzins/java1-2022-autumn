package lv.javaguru.training.lesson12;

public class NotEnoughFoundsException extends RuntimeException{

    public NotEnoughFoundsException(double balance, double withdrawAmount){
        super("bankas kontā nepietiek naudas" +
                "(bilance:" + balance + "pieprasita summa" + withdrawAmount);
    }

}
