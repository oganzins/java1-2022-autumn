package lv.javaguru.training.lesson4.Homework4;

public class GreatestOfTwo {

    private int first;

    private int second;

    public int getGreatest(int first, int second) {
        if (first > second) {
            return first;
        }
            return second;
    }
    public static void main(String[] args) {
    GreatestOfTwo greatestOfTwo = new GreatestOfTwo();

        System.out.println(greatestOfTwo.getGreatest(1,2));
        System.out.println(greatestOfTwo.getGreatest(3,4));
        System.out.println(greatestOfTwo.getGreatest(3,3));

    }
}
