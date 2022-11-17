package lv.javaguru.training.lesson3.homework;


public class Book {
     String title;
     String author;
     int pageCount;





    public void setTitle (String title) {
        this.title = title;
    }
    public void setAuthor (String author) {
        this.author = author;
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
public int getPageCount(){
        return this.pageCount;
}

    public static void main(String[]args) {
        Book BookDemo = new Book();
        BookDemo.author = "Robert Cecil Martin";
        BookDemo.title = "Clean Code";
        BookDemo.pageCount = 403;
        System.out.println("Book title: " + BookDemo.getTitle() + ", Author :" + BookDemo.getAuthor() + ", Page count :" + BookDemo.getPageCount());
        BookDemo.setAuthor("Robert Cecil Martin");
        BookDemo.setTitle("Clean Code");
        BookDemo.setPageCount(403);
        System.out.println("Book title: " + BookDemo.title + ", Author :" + BookDemo.author + ", Page count :" + BookDemo.pageCount);






    }

}

