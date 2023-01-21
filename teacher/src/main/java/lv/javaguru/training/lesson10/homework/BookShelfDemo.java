package lv.javaguru.training.lesson10.homework;

import java.util.List;

public class BookShelfDemo {

    public static void main(String[] args) {
        Book cleanCode =  new Book("Clean Code", "Robert C. Martin", 2007);
        Book cleanCoder = new Book("Clean Coder", "Robert C. Martin", 2011);
        Book cleanArchitecture = new Book("Clean Architecture", "Robert C. Martin", 2016);

        BookShelf bookShelf = new MyBookShelf();

        bookShelf.addBook(cleanCode);
        bookShelf.addBook(cleanCoder);
        bookShelf.addBook(cleanArchitecture);

        System.out.println(bookShelf.getBookCount()); //3

        List<Book> books = bookShelf.getAllBooks();
        books.remove(cleanCode);

        System.out.println(bookShelf.getBookCount()); // 2

    }

}
