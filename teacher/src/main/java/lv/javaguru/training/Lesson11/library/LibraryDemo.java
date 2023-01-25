package lv.javaguru.training.Lesson11.library;

public class LibraryDemo {

    public static void main(String[] args) {
        Book cleanCode = new Book("Clean Code", "Robert C. Martin", 400);
        Book greatGatsby = new Book("Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book cleanCoder = new Book("Clean Coder", "Robert C. Martin", 250);
        Book cleanArchitecture = new Book("Clean Architecture", "Robert C. Martin", 350);
        Book book1984 = new Book("1984", "George Orwell", 300);

        Library library = new SimpleLibrary();

        library.add(cleanCode);
        library.add(greatGatsby);
        library.add(cleanCode);
        library.add(cleanCode);
        library.add(cleanArchitecture);
        library.add(book1984);
        library.add(cleanCoder);
        library.add("Sprīdītis", "Anna Brigadere", 100);

        System.out.println(library.getAllBooks());
        System.out.println(library.findByTitle("Sprīdītis"));

        library.removeAllByAuthor("Robert C. Martin");

        System.out.println(library.getAllBooks());

        String mostPopularAuthor = library.findMostPopularAuthor();
        System.out.println(mostPopularAuthor);
    }

}
