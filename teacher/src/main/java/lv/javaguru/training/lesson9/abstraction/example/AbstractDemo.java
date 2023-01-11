package lv.javaguru.training.lesson9.abstraction.example;

public class AbstractDemo {

    public static void main(String[] args) {
        B objectB = new B("B value", "B other value");
        System.out.println(objectB.getValue());
        System.out.println(objectB.getOtherValue());
    }

}
