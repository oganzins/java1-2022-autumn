package lv.javaguru.training.lesson6;

public class MessageDemo {
    public static void main(String[] args) {
        System.out.println(Message.counter);

        Message firstMessage = new Message("Hello");

        System.out.println(Message.counter);

        Message secondMessage = new Message("Hello again");

        System.out.println(Message.counter);

        Message thirdMessage = new Message("Is anybody in there");

        System.out.println(Message.counter);
    }
}
