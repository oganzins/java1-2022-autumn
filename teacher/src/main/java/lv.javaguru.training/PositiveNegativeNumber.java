package lv.javaguru.training;

public class PositiveNegativeNumber {

    public boolean isPositive(int number) {
        return false;
    }

    public boolean isNegative(int number) {
        return false;
    }

    public static void main(String[] args) {
        PositiveNegativeNumber positiveNegativeNumber = new PositiveNegativeNumber();

        System.out.println(positiveNegativeNumber.isPositive(-1));
        System.out.println(positiveNegativeNumber.isPositive(-5));
        System.out.println(positiveNegativeNumber.isPositive(0));
        System.out.println(positiveNegativeNumber.isPositive(3));
        System.out.println(positiveNegativeNumber.isPositive(13));

        System.out.println(positiveNegativeNumber.isNegative(-1));
        System.out.println(positiveNegativeNumber.isNegative(-5));
        System.out.println(positiveNegativeNumber.isNegative(0));
        System.out.println(positiveNegativeNumber.isNegative(3));
        System.out.println(positiveNegativeNumber.isNegative(13));

    }

}
