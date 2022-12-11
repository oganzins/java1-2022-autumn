package lv.javaguru.training.lesson6;

public class MessageDemo {

    public static void main(String[] args) {
        System.out.println(Message.getCounter());

        Message firstMessage = new Message("Hello!");

        System.out.println(Message.getCounter());

        Message secondMessage = new Message("Hello again!");

        System.out.println(Message.getCounter());

        Message thirdMessage = new Message("Is anybody in there?");

        System.out.println(Message.getCounter());
    }

}