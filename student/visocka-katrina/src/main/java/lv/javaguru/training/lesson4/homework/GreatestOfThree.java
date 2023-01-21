package lv.javaguru.training.lesson4.homework;

public class GreatestOfThree {
    public int getGreatest(int first, int second, int third) {
        if (first > second && first > third) {
            return first;
        }
        if (second > first && second > third) {
            return second;
        }
        if (third > first && third > second) {
            return third;
        }
        if (first == second && second == third && third == first) {
            return first;
        }
        return 0;
    }

    public static void main(String[] args) {
        GreatestOfThree greatestOfThree = new GreatestOfThree();

        System.out.println(greatestOfThree.getGreatest(1, 2, 3));
        System.out.println(greatestOfThree.getGreatest(3, 4, 5));
        System.out.println(greatestOfThree.getGreatest(3, 2, 1));
        System.out.println(greatestOfThree.getGreatest(3, 3, 3));
    }
}
