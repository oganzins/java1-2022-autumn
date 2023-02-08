package lv.javaguru.training.lesson14.functional;

public class ConcatenateDemo {

    public static void main(String[] args) {
        Concatenate concatenate = (first, second) -> first + second;

        String greeting = concatenate.concatenate("Hello", " World!");

        System.out.println(greeting);

    }

}
