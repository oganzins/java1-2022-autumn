package lv.javaguru.training.lesson4.homework;

/*
    Homework accepted
 */
public class EvenOddNumber {

    public String getNumberType(int number) {
        if (number % 2 == 0) {
            return "Number is even";
        } else {
            return "Number is odd";
        }

    }

    public static void main(String[] args) {
        EvenOddNumber evenOddNubmer = new EvenOddNumber();

        System.out.println(evenOddNubmer.getNumberType(1));
        System.out.println(evenOddNubmer.getNumberType(0));
        System.out.println(evenOddNubmer.getNumberType(10));
        System.out.println(evenOddNubmer.getNumberType(13));
        System.out.println(evenOddNubmer.getNumberType(4));
    }
}
