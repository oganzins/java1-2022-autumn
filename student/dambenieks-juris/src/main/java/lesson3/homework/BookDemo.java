package lesson3.homework;

public class BookDemo {

    public static void main(String[] args) {
        Book Book = new Book();
        Book.setTitle("Clean code");
        Book.setAuthor("Robert Cecil Martin");
        Book.setPageCount(403);
        System.out.println("Book title: " + Book.title + " Book author: " + Book.author + ", Page count: " + Book.pageCount);
    }
}





