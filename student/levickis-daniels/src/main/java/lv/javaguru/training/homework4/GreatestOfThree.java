package lv.javaguru.training.homework4;

public class GreatestOfThree {

    public int getBiggest(int first, int second, int third) {
        if (first > second && first > third) {
            return first;
        } else if (second > first && second > third) {
            return second;
        } else if (third > first && third > second) {
            return third;
        } else return first;
    }


    public static void main(String[] args) {
        GreatestOfThree greatestOfThree = new GreatestOfThree(); // mājasdarbā kļūda, te ir klase no cita uzdevuma

        System.out.println(greatestOfThree.getBiggest(1, 2, 3));
        System.out.println(greatestOfThree.getBiggest(3, 4, 2));
        System.out.println(greatestOfThree.getBiggest(3, 2, 1));
        System.out.println(greatestOfThree.getBiggest(3, 3, 3));
    }


}
