package lv.javaguru.training.lesson4;

public class QuickMath {

    public static int max(int a, int b) {
        if (a > b)
        {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        QuickMath quickMath = new QuickMath();
        int result = quickMath.max(4, 9);
        System.out.println(result);
    }

}
