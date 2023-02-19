package lv.javaguru.training.lessons4;

public class Book {
    private int pageCount;

    public Book(int pageCount){
        this.pageCount = pageCount;
    }
    public String getSize(){
        if ( pageCount <= 50){
            return "Short";
        } else if (pageCount > 50 && pageCount <= 100){
            return "Medium size";
        } else if (pageCount >100 && pageCount <= 200){
            return "Long";
        } else {
            return "Very long";
        }

    }

    public static void main(String[] args) {
        Book shortBook = new Book(30);
        System.out.println(shortBook.getSize());

    }
}
