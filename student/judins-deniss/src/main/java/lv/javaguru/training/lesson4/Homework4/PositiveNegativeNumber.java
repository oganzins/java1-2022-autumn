package lv.javaguru.training.lesson4.Homework4;

public class PositiveNegativeNumber {

    private int i;

    public boolean isPositive(int i) {
        if (i > 0) {
            return true;
        }
        return false;
    }
    public boolean isNegative(int i) {
        if (i >= 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        PositiveNegativeNumber positiveNegativeNumber = new PositiveNegativeNumber();

        System.out.println(positiveNegativeNumber.isPositive(-1));
        System.out.println(positiveNegativeNumber.isPositive(-5));
        System.out.println(positiveNegativeNumber.isPositive(0));
        System.out.println(positiveNegativeNumber.isPositive(3));
        System.out.println(positiveNegativeNumber.isPositive(13));
        System.out.println("_______________________________________");
        System.out.println(positiveNegativeNumber.isNegative(-1));
        System.out.println(positiveNegativeNumber.isNegative(-5));
        System.out.println(positiveNegativeNumber.isNegative(0));
        System.out.println(positiveNegativeNumber.isNegative(3));
        System.out.println(positiveNegativeNumber.isNegative(13));
    }
}
