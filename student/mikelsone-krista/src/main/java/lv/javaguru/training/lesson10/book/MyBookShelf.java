package lv.javaguru.training.lesson10.book;

import java.util.ArrayList;
import java.util.List;

public class MyBookShelf implements BookShelf{

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
        return books;
    }

    @Override
    public int getBookCount() {
        int size = books.size();
        return size;
    }


    @Override
    public List<Book> findBooksByAuthor(String author) {
        List<Book> booksFound = new ArrayList<>();
        for (Book book : books){
            if (book.getAuthor().equals(author));
            booksFound.add(book);
        }
        return booksFound;
    }

    @Override
    public Book findBookByTitle(String title) {
        Book book1 = null;
        for(Book book = books) {
            if (book.getTitle().equals(title)){
                book1 = book;
                break;
            }
        }
        return book1;
    }

    @Override
    public List<Book> findBookReleasedInPeriod(int yearFrom, int yearTo) {
        List<Book> bookInPeriod = new ArrayList<>();
        for(Book book : books){
            if(book.getYear() >= yearFrom && book.getYear() <= yearTo){
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
        for(Book book : books){
            if (book.getTitle().equals(title)){
                books.remove(book);
                break;
            }
        }

    }

    @Override
    public void removeBooksByAuthor(String author) {
        for(Book book : books){
            if (book.getAuthor().equals(author)){
                books.remove(book);
                break;
            }
        }

    }


}
