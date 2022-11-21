package lv.javaguru.training.lesson3.homework;

public class Book {

private String title;
private String author;
private int pageCount;

Book(String title, String author, int pageCount){
    this.title = title;
    this.author = author;
    this.pageCount = pageCount;
}




public String getTitle(){
    return this.title;
}


    public String getAuthor(){
        return this.author;
    }

    public int getPageCount(){
        return this.pageCount;
    }

public void setTitle(String title) {
    this.title = title;
}

    public void setAuthor(String author){
        this.author = author;
}
    public void setPageCount(int pageCount){
        this.pageCount = pageCount;


    }











}
