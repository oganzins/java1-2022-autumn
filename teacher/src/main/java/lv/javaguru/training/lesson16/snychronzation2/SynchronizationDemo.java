package lv.javaguru.training.lesson16.snychronzation2;

public class SynchronizationDemo {

    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread alpha = new Thread(() -> executeTask());
        alpha.setName("Alpha");

        Thread beta = new Thread(() -> executeTask());
        beta.setName("Beta");

        alpha.start();
        beta.start();
    }

    private static void executeTask() {
        try {
            System.out.println(threadName() + ": Start task execution...");
            Thread.sleep(500);
            synchronized (lock) {
                System.out.println(threadName() + ": Executing task");
                System.out.println(threadName() + ": Finished task execution...");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static String threadName() {
        return Thread.currentThread().getName();
    }

}
