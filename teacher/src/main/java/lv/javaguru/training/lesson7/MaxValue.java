package lv.javaguru.training.lesson7;

public class MaxValue {

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int maxUsingTernary(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(max(3, 1));
    }


}
