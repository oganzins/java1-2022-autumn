package homework;

public class Book {

    String nosaukums;
    String autors;
    int lpp;

    Book(String nosaukums, String autors, int lpp) {
        this.nosaukums = nosaukums;
        this.autors = autors;
        this.lpp = lpp;
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
        BookDemo.setlpp(403);
        System.out.println("Book title:" + BookDemo.getnosaukums());
        System.out.println("Author:" + BookDemo.getautors());
        System.out.println("Page count:" + BookDemo.getlpp());





    }


}
