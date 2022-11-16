package Homework;

public class Book {

    private String title;
    private String author;
    private int pageCount;

    public String getBookTitle(){
        return title;
    }

    public String getBookAuthor(){
        return author;
    }

    public int getBookPageCount(){
        return pageCount;
    }

    public void setBookTitle(String newValue){
        title = newValue;
    }

    public void setBookAuthor(String newValue) {
        author = newValue;
    }

    public void setBookPageCount(int newValue){
        pageCount = newValue;
    }
}
class BookDemo {
    public static void main(String[] args){
        Book obj = new Book();
        obj.setBookTitle("Clean Code");
        obj.setBookAuthor("Robert Cecil Martin");
        obj.setBookPageCount(403);

        System.out.println("Book title: " + obj.getBookTitle() + ", Author: " + obj.getBookAuthor() + ", Page count: " + obj.getBookPageCount());
    }
}
