package lv.javaguru.training.lesson15.reference;

import java.util.function.Supplier;

public class Greeting {

    private String name;

    public Greeting(String name) {
        this.name = name;
    }

    public String sayHello() {
        return "Hello " + name + "!";
    }

    public static void main(String[] args) {
        Greeting greeting = new Greeting("John");
        Supplier<String> greetingLambda = () -> greeting.sayHello();

        Supplier<String> greetingMethodReference = greeting::sayHello;
    }

}
