package lv.javaguru.training.lesson16.methods;

public class SimpleThread extends Thread {

    private long sleepTime;

    public SimpleThread(String name, long sleepTime) {
        this.sleepTime = sleepTime;
        setName(name);
        setDaemon(true);
    }

    @Override
    public void start() {
        System.out.println("Thread " + getName() + " has started");
        super.start();
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread " + getName() + " is running");
            Thread.sleep(sleepTime);
            System.out.println("Thread " + getName() + " is finished");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
