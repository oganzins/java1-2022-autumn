package lv.javaguru.training.lesson4.homework;

public class EvenOddNumber {
    public String getNumberType(int number){
        if(number % 2 == 0){
            return "Number is even!";
        }else{
            return "Number is odd!";
        }
    }

    public static void main(String[] args) {
        EvenOddNumber evenOddNumber = new EvenOddNumber();

        System.out.println(evenOddNumber.getNumberType(1));
        System.out.println(evenOddNumber.getNumberType(0));
        System.out.println(evenOddNumber.getNumberType(10));
        System.out.println(evenOddNumber.getNumberType(13));
        System.out.println(evenOddNumber.getNumberType(4));
    }
}
