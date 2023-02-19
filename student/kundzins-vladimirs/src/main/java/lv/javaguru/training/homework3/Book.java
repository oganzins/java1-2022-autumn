package lv.javaguru.training.homework3;

public class Book {

    private String title;
    private String author;
    private int pageCount;


    public void setTitle(String Title) {
        this.title = Title;
    }

    public void setAuthor(String Author) {
        this.author = Author;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPageCount() {
        return this.pageCount;
    }


    public static void main(String[] args) {
        Book BookDemo = new Book();

        BookDemo.author = "Author";
        BookDemo.title = "Title";
        BookDemo.pageCount = 403;

        String bookAuthor = BookDemo.getAuthor();
        String bookTitle = BookDemo.getTitle();
        int bookPageCount = BookDemo.getPageCount();
        System.out.println("Book author " + bookTitle + "Book title " + bookAuthor + "Page Count " + bookPageCount);
    }
}
