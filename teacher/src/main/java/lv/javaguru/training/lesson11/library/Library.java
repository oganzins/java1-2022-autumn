package lv.javaguru.training.lesson11.library;

import java.util.Collection;

public interface Library {

    void add(Book book);

    void add(String title, String author, int pageCount);

    Collection<Book> getAllBooks();

    Book findByTitle(String title);

    Collection<Book> findByAuthor(String author);

    Book findLongestBook();

    Book findShortestBook();

    int getAverageBookLength();

    void remove(Book book);

    void remove(String title);

    void removeAllByAuthor(String author);

    String findMostPopularAuthor();

}
