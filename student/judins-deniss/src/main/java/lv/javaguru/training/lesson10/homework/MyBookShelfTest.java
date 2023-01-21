package lv.javaguru.training.lesson10.homework;

import java.util.List;

public class MyBookShelfTest {
    public static void main(String[] args) {
        addsBookAndVerifiesThatBookIsAdded();
        verifiesBookCount();
        findsBooks();
        removesBooks();
    }

    private static void addsBookAndVerifiesThatBookIsAdded() {
        Book book = new Book("Pride and Prejudice", "Jane Austen", 1813);

        BookShelf bookShelf = new MyBookShelf();
        bookShelf.addBook(book);
        List<Book> books = bookShelf.getAllBooks();

        System.out.println("There is only 1 book retrieved: " + (books != null && books.size() == 1));
        System.out.println("Retrieved book matches added book: " + (books != null && books.get(0).equals(book)));
    }

    private static void verifiesBookCount() {
        BookShelf bookShelf = new MyBookShelf();
        System.out.println("Book shelf is empty after creation : " + (bookShelf.getBookCount() == 0));

        Book prideAndPrejudice = new Book("Pride and Prejudice", "Jane Austen", 1813);
        bookShelf.addBook(prideAndPrejudice);
        System.out.println("After 1st book is added, book count is 1: " + (bookShelf.getBookCount() == 1));

        Book greatGatsby = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        bookShelf.addBook(greatGatsby);
        System.out.println("After 2nd book id added, book count is 2: " + (bookShelf.getBookCount() == 2));

        bookShelf.removeBook(greatGatsby);
        System.out.println("After 2nd book is removed, book count is 1: " + (bookShelf.getBookCount() == 1));
    }

    public static void findsBooks() {
        Book nineteenEightyFour = new Book("1984", "George Orwell", 1949);
        Book prideAndPrejudice = new Book("Pride and Prejudice", "Jane Austen", 1813);
        Book greatGatsby = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book animalFarm = new Book("Animal Farm", "George Orwell", 1945);

        BookShelf bookShelf = new MyBookShelf();
        bookShelf.addBook(prideAndPrejudice);
        bookShelf.addBook(greatGatsby);
        bookShelf.addBook(nineteenEightyFour);
        bookShelf.addBook(animalFarm);

        List<Book> georgeOrwellBooks = bookShelf.findBooksByAuthor("George Orwell");
        System.out.println("Found 2 books: " + (georgeOrwellBooks != null && georgeOrwellBooks.size() == 2));
        System.out.println("Found books matches expected books: "
                + (georgeOrwellBooks != null && georgeOrwellBooks.contains(nineteenEightyFour) && georgeOrwellBooks.contains(animalFarm)));

        bookShelf.findBookByTitle("1984");

        List<Book> booksInPeriod = bookShelf.findBookReleasedInPeriod(1940, 1949);
        System.out.println("Found 2 books in period from 1940 - 1949: " + (booksInPeriod != null && booksInPeriod.size() == 2));
        System.out.println("In period found books matches expected books: "
                + (booksInPeriod != null && booksInPeriod.contains(nineteenEightyFour) && booksInPeriod.contains(animalFarm)));
    }

    public static void removesBooks() {
        Book nineteenEightyFour = new Book("1984", "George Orwell", 1949);
        Book prideAndPrejudice = new Book("Pride and Prejudice", "Jane Austen", 1813);
        Book greatGatsby = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book animalFarm = new Book("Animal Farm", "George Orwell", 1945);

        BookShelf bookShelf = new MyBookShelf();
        bookShelf.addBook(prideAndPrejudice);
        bookShelf.addBook(greatGatsby);
        bookShelf.addBook(nineteenEightyFour);
        bookShelf.addBook(animalFarm);
        System.out.println("Book count before book removal is 4: " + (bookShelf.getBookCount() == 4));

        bookShelf.removeBook(prideAndPrejudice);
        System.out.println("Book count after removal of 1st book is 3: " + (bookShelf.getBookCount() == 3));

        bookShelf.removeBookByTitle("The Great Gatsby");
        System.out.println("Book count after removal by title is 2: " + (bookShelf.getBookCount() == 2));

        bookShelf.removeBooksByAuthor("George Orwell");
        System.out.println("Book count after removal by author is 0: " + (bookShelf.getBookCount() == 0));
    }
}
