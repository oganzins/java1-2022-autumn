package lv.javaguru.training.lesson6;

public class Message {
    private static int counter;
    private String text;

    public Message(String text) {
        this.text = text;
        System.out.println(text);
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
