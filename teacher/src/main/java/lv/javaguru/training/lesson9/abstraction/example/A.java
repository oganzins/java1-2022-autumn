package lv.javaguru.training.lesson9.abstraction.example;

public abstract class A {

    private String value;

    public A(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public abstract String getOtherValue();

}
