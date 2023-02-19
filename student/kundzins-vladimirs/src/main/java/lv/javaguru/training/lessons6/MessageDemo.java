package lv.javaguru.training.lessons6;

public class MessageDemo {

    public static void main(String[] args) {
        System.out.println(Message.counter);

        Message firstMessage = new Message("Hello");

        System.out.println(firstMessage);

        Message secondMessage = new Message("Hello again");

        System.out.println(secondMessage);

        Message thirdMessage = new Message("Opacki");

        System.out.println(thirdMessage);
    }
}
