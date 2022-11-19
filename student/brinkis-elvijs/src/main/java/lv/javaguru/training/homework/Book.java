package lv.javaguru.training.homework;

import java.util.Stack;
import java.util.StringJoiner;

public class Book {

    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public Book(Book book) {
        this.title = book.title;
        this.author = book.author;
        this.pages = book.pages;
    }

    public String getTitle() {
        return title;
    }

   public void setAuthor(String author) {
        this.author = author;
    }



}
