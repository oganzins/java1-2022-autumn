package lv.javaguru.training.lesson3.homework;

public class BookDemo {
    public static void main(String[] args) {
        Book title = new Book();
        title.setTitle("Maestro");
        Book author = new Book();
        author.setAuthor("Anšlavs Eglītis");
        Book pageCount = new Book();
        pageCount.setPageCount(341);

        String bookTitle = title.getTitle();
        String bookAuthor = author.getAuthor();
        int pageCount = pageCount.getPageCount();

        System.out.println("Book title: " + bookTitle, "Author: " + bookAuthor, "Page count: " + pageCount);


        }

    }


