package lv.javaguru.training.lesson4;

public class Book {
    private int pageCount;

    public Book(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getSize() {
        if (pageCount <= 50) {
            return "Short";
        } else if (pageCount > 50 && pageCount <= 100) {
            return "Medium sized";
        } else if (pageCount > 100 && pageCount < 200) {
            return "long";
        }


    }

    public static void main(String[] args) {
        Book shortBook = new Book(30);
        System.out.println(shortBook.getSize());

        Book mediumBook = new Book(80);
        System.out.println(mediumBook.getSize());

        Book longBook = new Book(150);
        System.out.println(longBook.getSize());
    }
}

