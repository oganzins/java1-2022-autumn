package lv.javaguru.training.lesson16.join;

public class JoinDemo {

    public static void main(String[] args) throws InterruptedException {
        Thread hello = new Thread(() -> System.out.println("Hello"));
        Thread world = new Thread(() -> {
            try {
                Thread.sleep(3000);
                System.out.println("World");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });

        world.start();
        hello.start();

        hello.join();
        world.join();
    }
}
