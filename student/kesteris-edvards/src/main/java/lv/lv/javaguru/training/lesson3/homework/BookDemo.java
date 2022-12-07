package lv.lv.javaguru.training.lesson3.homework;

/*
    Homework accepted
 */
public class BookDemo {

    public static void main(String[] args) {

        Book book = new Book();
        book.setTitle("Harry Potter");
        book.setAuthor("J. K. Rowling");
        book.setPageCount(223);

        System.out.println("Book title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Page count: " + book.getPageCount());
    }

}
