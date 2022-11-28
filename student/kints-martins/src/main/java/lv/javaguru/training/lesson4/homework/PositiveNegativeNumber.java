package lv.javaguru.training.lesson4.homework;

public class PositiveNegativeNumber {


    public boolean isPositive(int number) {
        if (number > 0) {
            return true;
        }
        return false;
    }

    public boolean isNegative(int number) {
        if (number < 0) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        PositiveNegativeNumber positiveNegativeNumber = new PositiveNegativeNumber();
        System.out.println(positiveNegativeNumber.isPositive(-1));
        System.out.println(positiveNegativeNumber.isPositive(-5));
        System.out.println(positiveNegativeNumber.isPositive(0));
        System.out.println(positiveNegativeNumber.isPositive(3));
        System.out.println(positiveNegativeNumber.isPositive(13));

        System.out.println();

        System.out.println(positiveNegativeNumber.isNegative(-1));
        System.out.println(positiveNegativeNumber.isNegative(-5));
        System.out.println(positiveNegativeNumber.isNegative(0));
        System.out.println(positiveNegativeNumber.isNegative(3));
        System.out.println(positiveNegativeNumber.isNegative(13));


    }
}

