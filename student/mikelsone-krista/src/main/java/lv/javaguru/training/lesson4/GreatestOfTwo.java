package lv.javaguru.training.lesson4;

public class GreatestOfTwo {
    public int getGreatest(int first, int second) {

        if(first >= second){
            return first;
        }
        return second;
    }
    public static void main(String[]args){
        GreatestOfTwo greatestOfTwo = new GreatestOfTwo();

        System.out.println(greatestOfTwo.getGreatest(1, 2));
        System.out.println(greatestOfTwo.getGreatest(3, 4));
        System.out.println(greatestOfTwo.getGreatest(3, 3));
    }
}
