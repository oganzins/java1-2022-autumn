package lv.javaguru.training.lesson3.homework;

public class BookDemo {
    public static void main(String[] args) {
        Book BookTitle = new Book("Clean Code", "Robert Cecil Martin", 403);
        System.out.println("Book Title:" + BookTitle.getTitle() + "," + " " + "Author"+ " " + BookTitle.getAuthor() + "," + " " + "Page Count:" + " " + BookTitle.getPageCount());


    }
}
