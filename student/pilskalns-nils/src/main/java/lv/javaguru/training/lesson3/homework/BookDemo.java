package lv.javaguru.training.lesson3.homework;

public class BookDemo {
    String title;
    String author;
    int pageCount;

public void setTitle(String title){
    this.title = title;
}
public void setAuthor(String author){
    this.author = author;
}
public void setPageCount(int pageCount){
    this.pageCount = pageCount;
}







    public static void main(String[] args) {

        BookDemo book = new BookDemo();
        book.setAuthor("Robert Cecil Martin");
        book.setTitle("Clean Code");
        book.setPageCount(403);
        System.out.println("Book title: " + book.title + ", Author :" + book.author + ", Page count :" + book.pageCount);



    }
}
