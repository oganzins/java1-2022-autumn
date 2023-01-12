package lv.javaguru.training.lesson10.homework;

import java.util.ArrayList;
import java.util.Iterator;
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
        List<Book> allBooks = new ArrayList<>();
        for (Book book : books) {
            allBooks.add(book);
        }
        return allBooks;
    }

    @Override
    public int getBookCount() {
        int size = books.size();
        return size;
    }

    @Override
    public List<Book> findBooksByAuthor(String author) {
        List<Book> booksFound = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                booksFound.add(book);
            }
        }
        return booksFound;
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
        List<Book> bookInPeriod = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() >= yearFrom && book.getYear() <= yearTo) {
                bookInPeriod.add(book);
            }
        }
        return bookInPeriod;
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
                break;
            }
        }

    }

    @Override
    public void removeBooksByAuthor(String author) {
        for (int i = books.size() - 1; i >= 0; i--) {
            if (books.get(i).getAuthor().equals(author)) {
                books.remove(i);



              /* for(int i = 0 ; i <= books.size();i++){
                   if(books.get(i).getAuthor().equals(author)){
                       books.remove(i);*/
            }
        }
    }
}
















