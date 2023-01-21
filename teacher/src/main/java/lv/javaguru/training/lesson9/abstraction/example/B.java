package lv.javaguru.training.lesson9.abstraction.example;

public class B extends A {

    private String otherValue;

    public B(String value, String otherValue) {
        super(value);
        this.otherValue = otherValue;
    }

    @Override
    public String getOtherValue() {
        return otherValue;
    }


}
