package lv.javaguru.training.lesson08.inheritance.hidden;

public class Parent {

    public String field;

    public Parent(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void printField() {
        System.out.println(field);
    }


}
