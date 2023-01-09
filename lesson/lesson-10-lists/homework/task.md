# 10. Nodarbība
## Uzdevums
### Grāmatu plaukts

**Klase Book**

Pa soļiem:
1. Izveidojam jaunu klasi **Book**:
```java
public class Book {

   private String title;
   private String author;
   private int year;

   public Book(String title, String author, int year) {
      this.title = title;
      this.author = author;
      this.year = year;
   }    
    
}
```
2. Visiem klases laukiem izveidojam **getter** metodes.
3. Uzģenerējam **equals()** un **hashCode()** metodes (_Menu: Code -> Generate... -> equals() and hashCode()_)

**BookShelf Interfeiss**

Pa soļiem:

1. Izveidojam interfeisu BookShelf:
```java
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

```

**BookShelf Implementācija**

Pa soļiem:

1. Izveidojam klasi **MyBookShelf**, kas implementē **BookShelf** interfeisu:
```java
public class MyBookShelf implements BookShelf {

   private List<Book> books;

   public MyBookShelf() {
      books = new ArrayList<>();
   }

   @Override
   public void addBook(Book book) {

   }

   @Override
   public List<Book> getAllBooks() {
      return null;
   }

   @Override
   public int getBookCount() {
      return 0;
   }

   @Override
   public List<Book> findBooksByAuthor(String author) {
      return null;
   }

   @Override
   public Book findBookByTitle(String title) {
      return null;
   }

   @Override
   public List<Book> findBookReleasedInPeriod(int yearFrom, int yearTo) {
      return null;
   }

   @Override
   public void removeBook(Book book) {

   }

   @Override
   public void removeBookByTitle(String title) {

   }

   @Override
   public void removeBooksByAuthor(String author) {

   }

}
```
2. Implementējam korekti visas interfeisa metodes - grāmatu pievienošanai, noņemšanai un meklēšanai ir jāizmanto klases saraksta mainīgais *books*:
   * addBook - pievieno grāmatu plauktam;
   * getAllBooks - atgriež sarakstu ar grāmatām, kas atrodas plauktā;
   * getBookCount - atgriež grāmatu skaitu plauktā;
   * findBooksByAuthor - atgriež sarakstu ar visām autora grāmatām, kuras atrodamas plauktā;
   * findBookByTitle - atgriež pirmo grāmatu, kurai sakrīt nosaukums ar padoto nosaukumu;
   * findBookReleasedInPeriod - atgirež sarakstu ar visām grāmatām, kas izdotas konkrētajā periodā un kuras ir atrodamas plauktā;
   * removeBook - noņem grāmatu no plaukta;
   * removeBookByTitle - noņem pirmo grāmatu no plaukta, kurai sakrīt nosaukums ar padoto nosaukumu;
   * removeBooksByAuthor - noņem visas padotā autora grāmatas no plaukta.

**MyBookShelf klases pārbaude**

Pa soļiem:

1. Izveidojam klasi **MyBookShelfTest**:
```java
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
```
2. Izpildām **main** metodi.
3. Pārliecināmies, ka izvadītais rezultāts konsolē sakrīt ar:
```
There is only 1 book retrieved: true
Retrieved book matches added book: true
Book shelf is empty after creation : true
After 1st book is added, book count is 1: true
After 2nd book id added, book count is 2: true
After 2nd book is removed, book count is 1: true
Found 2 books: true
Found books matches expected books: true
Found 2 books in period from 1940 - 1949: true
In period found books matches expected books: true
Book count before book removal is 4: true
Book count after removal of 1st book is 3: true
Book count after removal by title is 2: true
Book count after removal by author is 0: true
```