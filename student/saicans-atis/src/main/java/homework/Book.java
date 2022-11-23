package homework;

public class Book {

    String nosaukums;
    String autors;
    int lpp;

    Book(String nosaukums, String autors, int lpp) {
        this.nosaukums = nosaukums;
        this.autors = autors;
        this.lpp = 5;
    }

    public String getnosaukums() {return this.nosaukums;  }
    public void setnosaukums(String nosaukums) {this.nosaukums = nosaukums;  }

    public String getautors() {return this.autors; }
    public void setautors(String autors) {this.autors = autors; }

    public int getlpp() {return this.lpp; }
    public void setlpp(int lpp) {this.lpp = lpp; }





    public static void main(String[] args) {
        Book BookDemo = new Book ("Tīrs Kods","Roberts Cecils Martins",404);
        System.out.println(BookDemo.getnosaukums());
        BookDemo.setnosaukums("Clean Code");
        BookDemo.setautors("Robert Cecil Martin");
        BookDemo.setlpp(404);
        System.out.println("Book Title:"); System.out.println(BookDemo.getnosaukums());
        System.out.println("Author:"); System.out.println(BookDemo.getautors());
        System.out.println("Page count:"); System.out.println(BookDemo.getlpp());





    }


}
