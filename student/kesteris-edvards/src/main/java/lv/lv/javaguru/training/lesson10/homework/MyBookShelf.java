package lv.lv.javaguru.training.lesson10.homework;

import java.util.ArrayList;
import java.util.List;

public class MyBookShelf implements BookShelf {

    private final List<Book> books;

    public MyBookShelf() {
        books = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public List<Book> getAllBooks() {
        List<Book> findAllBooks = new ArrayList<>();
        for (Book book : books) {
            findAllBooks.add(book);
        }
        return findAllBooks;
    }

    @Override
    public int getBookCount() {
        return books.size();
    }

    @Override
    public List<Book> findBooksByAuthor(String author) {
        List<Book> findBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author))
                findBooks.add(book);
        }
        return findBooks;
    }

    @Override
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public List<Book> findBookReleasedInPeriod(int yearFrom, int yearTo) {
        List<Book> findBookByPeriod = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() >= yearFrom && book.getYear() <= yearTo) {
                findBookByPeriod.add(book);
            }
        }
        return findBookByPeriod;
    }

    @Override
    public void removeBook(Book book) {
        books.remove(book);
    }

    @Override
    public void removeBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                books.remove(book);
            }
            return;
        }
    }

    @Override
    public void removeBooksByAuthor(String author) {
        for (int i = books.size() - 1; i >= 0; i--) {
            if (books.get(i).getAuthor().equals(author)) {
                books.remove(i);
            }
        }
    }
}
