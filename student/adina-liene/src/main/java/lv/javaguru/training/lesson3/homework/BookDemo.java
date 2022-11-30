package lv.javaguru.training.lesson3.homework;

/*
    Homework accepted.
 */
public class BookDemo {

    public static void main(String[] args) {

        Book book = new Book();
        book.setTitle("Police");
        book.setAuthor("Jo Nesbo");
        book.setPageCount(512);

        System.out.println("Book title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Page count: " + book.getPageCount());
    }

}




