package lv.javaguru.training.lesson10.homework;

import java.util.List;

public interface BookShelf {

    void addBook(Book book);

    List<Book> getAllBooks();

    int getBookCount();

    List<Book> findBooksByAuthor(String author);

    Book findBookByTitle(String title);

    List<Book> findBookReleasedInPeriod(int yearFrom, int yearTo);

    void removeBook(Book book);

    void removeBookByTitle(String title);

    void removeBooksByAuthor(String author);

}
