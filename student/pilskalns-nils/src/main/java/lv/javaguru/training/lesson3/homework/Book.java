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
        Book myBook = new Book();
        myBook.setAuthor("Clean Code");
        myBook.setTitle("Robert Cecil Martin");
        myBook.setPageCount(403);
        myBook.title = "Clean Code";
        myBook.author = "Robert Cecil Martin";
        myBook.pageCount = (403);

        System.out.println(myBook.getTitle() + myBook.getAuthor() + myBook.getPageCount());






}

}

