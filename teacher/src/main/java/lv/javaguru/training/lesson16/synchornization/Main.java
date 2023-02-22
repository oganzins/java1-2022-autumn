package lv.javaguru.training.lesson16.synchornization;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(50.00);
        PaymentTask paymentTask = new PaymentTask(bankAccount, 5);

        Thread alphaThread = new Thread(paymentTask);
        alphaThread.setName("Alpha");
        alphaThread.start();

        Thread betaThread = new Thread(paymentTask);
        betaThread.setName("Beta");
        betaThread.start();
    }

}
