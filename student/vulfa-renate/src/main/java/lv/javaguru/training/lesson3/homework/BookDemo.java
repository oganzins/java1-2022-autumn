package lv.javaguru.training.lesson3.homework;

public class BookDemo {
    public static void main(String[] args) {

    Book book = new Book();
    book.setTitle("Coraline");
    book.setAuthor(" Neil Gaiman ");
    book.setPageCount(214);

    String title = book.getTitle();
    String author = book.getAuthor();
    int pageCount = book.getPageCount();;

    System.out.println("Book title : " + title + ", " + "Author : " + author + "," + " Page count : " + pageCount);
}
}
