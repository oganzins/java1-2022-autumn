package lv.javaguru.training.lesson9.combined.read;

public class ReadableDemo {

    public static void main(String[] args) {
        TextMessage message = new TextMessage("Hello World!");
        System.out.println(message.read());

        String[] pages = {"Hello Wolrd!", "Sveika pasaule!", "Hallo Welt!"};
        Book book = new Book(pages);
        System.out.println(book.read());
    }

}
