package lv.javaguru.training.lesson3.homework;

public class BookDemo {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Rebecca");
        book.setAuthor("Daphne du Maurier");
        book.setPageCount(448);

        System.out.println("Book title: " + book.getTitle() +
                ", Book author: " + book.getAuthor() +
                ", Page count: " + book.getPageCount());

    }
}
