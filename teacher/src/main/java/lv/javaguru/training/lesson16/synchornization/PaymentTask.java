package lv.javaguru.training.lesson16.synchornization;

public class PaymentTask implements Runnable {

    private BankAccount account;
    private int paymentCount;

    public PaymentTask(BankAccount account, int paymentCount) {
        this.account = account;
        this.paymentCount = paymentCount;
    }

    @Override
    public void run() {
        for (int i = 0; i < paymentCount; i++) {
            withdraw(10);
            pause(500);
            if (account.getBalance() < 0) {
                System.out.println(Thread.currentThread().getName() + ": Negative balance " + account.getBalance());
            }
        }
    }

    private synchronized void withdraw(double amount) {
        if (account.getBalance() >= amount) {
            pause(1000);
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + ": Withdrawal of amount " + amount);
        } else {
            System.out.println(Thread.currentThread().getName() + ": Not enough money!");
        }
    }

    private void pause(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
