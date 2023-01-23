package lv.javaguru.training.lesson08.hidden;

public class HiddenDemo {

    public static void main(String[] args) {
        Parent parent = new Parent("Parent");
        System.out.println(parent.field);
        System.out.println(parent.getField());

        Child child = new Child("Child");
        System.out.println(child.getField());
    }

}
