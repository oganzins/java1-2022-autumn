package lv.javaguru.training.lesson4;

public class Book {
    public int pageCount;
    public Book(int pageCount) {
        this.pageCount = pageCount;
    }
    public String getSize() {
        if (pageCount <= 50) {
            return "Short";
        } else if (pageCount > 50 && pageCount <= 100) {
            return "Medium sized";
        } else if (pageCount > 100 && pageCount <= 200) {
            return "Very long";
        } else {
            return "Long";
        }
    }
        public static void main(String[] args) {
            Book shortbook = new Book(30);
            System.out.println(shortbook.getSize());
        }
    }

