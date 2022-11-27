package lv.lv.javaguru.training.lesson4.homework;

public class GreatestOfTwo {

    public int getGreatest(int first, int second) {

        if (first > second) {
            return first;
        } else if (first <= second) {
            return second;
        }
        return 0;
    }

    public static void main(String[] args) {
        GreatestOfTwo greatestOfTwo = new GreatestOfTwo();

        System.out.println(greatestOfTwo.getGreatest(1, 2));
        System.out.println(greatestOfTwo.getGreatest(3, 4));
        System.out.println(greatestOfTwo.getGreatest(3, 3));
    }
}
