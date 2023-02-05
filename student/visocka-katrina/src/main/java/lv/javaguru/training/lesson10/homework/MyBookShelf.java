package lv.javaguru.training.lesson10.homework;

import java.util.ArrayList;
import java.util.List;

public class MyBookShelf implements BookShelf {
    private List<Book> books;

    public MyBookShelf() {
        books = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        this.books.add(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return this.books;
    }

    @Override
    public int getBookCount() {
        return this.books.size();
    }

    @Override
    public List<Book> findBooksByAuthor(String author) {
        List<Book> returnBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                returnBooks.add(book);
            }
        }
        return returnBooks;
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
        List<Book> returnBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() >= yearFrom && book.getYear() <= yearTo) {
                returnBooks.add(book);
            }
        }
        return returnBooks;
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
        List<Book> booksToRemove = findBooksByAuthor(author);
        books.removeAll(booksToRemove);
    }
}
