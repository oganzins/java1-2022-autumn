package lv.javaguru.training.Lesson11.library;

import java.util.*;

public class SimpleLibrary implements Library {

    private Map<String, Book> books;

    public SimpleLibrary() {
        books = new HashMap<>();
    }

    @Override
    public void add(Book book) {
        if (isPresent(book)) {
            books.put(book.getTitle(), book);
        }
    }

    @Override
    public void add(String title, String author, int pageCount) {
        Book book = new Book(title, author, pageCount);
        add(book);
    }

    @Override
    public Collection<Book> getAllBooks() {
        return books.values();
    }

    @Override
    public Book findByTitle(String title) {
        return books.get(title);
    }

    @Override
    public Collection<Book> findByAuthor(String author) {
        Set<Book> foundBooks = new HashSet<>();
        for (Book book : books.values()) {
            if (book.getAuthor().equals(author)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    @Override
    public Book findLongestBook() {
        Book longestBook = null;
        for (Book book : books.values()) {
            if (longestBook == null || longestBook.getPageCount() < book.getPageCount()) {
                longestBook = book;
            }
        }

        return longestBook;
    }

    @Override
    public Book findShortestBook() {
        Book shortestBook = null;
        for (Book book : books.values()) {
            if (shortestBook == null || shortestBook.getPageCount() > book.getPageCount()) {
                shortestBook = book;
            }
        }
        return shortestBook;
    }

    @Override
    public int getAverageBookLength() {
        int totalPageCount = 0;
        for (Book book : books.values()) {
            totalPageCount += book.getPageCount(); // totalPageCount = totalPageCount + book.getPageCount();
        }
        if (books.size() > 0) {
            return totalPageCount / books.size();
        } else {
            return 0;
        }

    }

    @Override
    public void remove(Book book) {
        remove(book.getTitle());
    }

    @Override
    public void remove(String title) {
        books.remove(title);
    }

    @Override
    public void removeAllByAuthor(String author) {
        for (Book book : books.values()) {
            if (book.getAuthor().equals(author)) {
                books.remove(book.getAuthor());
            }
        }
    }

    @Override
    public String findMostPopularAuthor() {
        //books - bookCountByAuthor
        Map<String, Integer> bookCountByAuthor = null;
        return null;
    }

    private boolean isPresent(Book book) {
        return !books.containsKey(book.getTitle());
    }
}
