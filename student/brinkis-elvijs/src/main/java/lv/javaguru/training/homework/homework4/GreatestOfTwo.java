package lv.javaguru.training.homework.homework4;

public class GreatestOfTwo {
    public int getGreatest;

    public int getGreatest(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }

    }
    public static void main(String[] args) {
        GreatestOfTwo greatestOfTwo = new GreatestOfTwo();
                    System.out.println(greatestOfTwo.getGreatest(1, 2));
                    System.out.println((greatestOfTwo.getGreatest(3, 4)));
                    System.out.println(greatestOfTwo.getGreatest(3, 3));
    }
}


