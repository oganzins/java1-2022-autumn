package lv.javaguru.training.homework10;

import java.util.ArrayList;
import java.util.List;

public class MyBookShelf implements BookShelf {

    private List<Book> books;

    public MyBookShelf() {
        books = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return books;
    }

    @Override
    public int getBookCount() {
        return books.size();
    }

    @Override
    public List<Book> findBooksByAuthor(String author) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    @Override
    public Book findBookByTitle(String title) {
        Book foundBook = null;
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                foundBook = book;
                break;
            }
        }
        return foundBook;
    }

    @Override
    public List<Book> findBookReleasedInPeriod(int yearFrom, int yearTo) {
        List<Book> foundBooksPeriod = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() >= yearFrom && book.getYear() <= yearTo) {
                foundBooksPeriod.add(book);
            }
        }
        return foundBooksPeriod;
    }

    @Override
    public void removeBook(Book book) {
        books.remove(book);
    }

    @Override
    public void removeBookByTitle(String title) {
        Book book = findBookByTitle(title);
        removeBook(book);
    }



    @Override
    public void removeBooksByAuthor(String author) {
        List<Book> booksByAuthor = findBooksByAuthor(author);
        for (Book book : booksByAuthor) {
            removeBook(book);
        }
    }
}
