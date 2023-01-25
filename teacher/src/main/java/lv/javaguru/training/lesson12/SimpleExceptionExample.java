package lv.javaguru.training.lesson12;

public class SimpleExceptionExample {

    public static void main(String[] args) {
        try {
            String value = null;
            value.getBytes();
        } catch (RuntimeException e) {
            System.out.println("Catches RuntimeException");
        } catch (Exception e) {
            System.out.println("Catches Exception");
        } finally {
            System.out.println("Executes finally block");
        }
    }

}
