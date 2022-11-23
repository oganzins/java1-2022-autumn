package lv.javaguru.training.lesson3.homework;

public class BookDemo {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Maestro");
        book.setAuthor("Anšlavs Eglītis");
        book.setPageCount(341);

        String bookTitle = book.getTitle();
        String bookAuthor = book.getAuthor();
        int pageCount = book.getPageCount();

        System.out.println("Book title: " + bookTitle + "Author: " + bookAuthor + "Page count: " + pageCount);

    }

}


