package lv.javaguru.training.lesson8.single;

public class A {

    private String field = "A: Field";
    protected String protectedField = "A: Protected Field";
    private String privateField = "A: Private Field";

    public String getField() {
        return field;
    }

    protected String getProtectedField() {
        return protectedField;
    }

    private String getPrivateField() {
        return privateField;
    }

    public String getName() {
        return this.getClass().getName();
    }

}
