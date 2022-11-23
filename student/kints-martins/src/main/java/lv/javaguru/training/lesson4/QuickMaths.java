package lv.javaguru.training.lesson4;

public class QuickMaths {

    public int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
        }

        public static void main(String[] args) {
        QuickMaths quickMaths = new QuickMaths();
        int result = quickMaths.max(4, 9);
        System.out.println(result);
        }
    }
