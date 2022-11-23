package lv.javaguru.training.lesson3;

public class BookDemo {

    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Twisted Love");
        book.setAuthor("Anna Huang");
        book.setPageCount(356);

        System.out.println("Book title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Page Count: " + book.getPageCount());

    }
}
