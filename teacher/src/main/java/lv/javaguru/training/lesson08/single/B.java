package lv.javaguru.training.lesson08.single;

public class B extends A {

    private String specialField = "B: Special Field";

    public String getSpecialField() {
        return specialField;
    }

    @Override
    public String getField() {

        return "B: Field";
    }

    @Override
    public String getProtectedField() {
        return this.protectedField;
    }

}
