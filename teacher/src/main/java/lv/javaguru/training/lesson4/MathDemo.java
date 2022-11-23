package lv.javaguru.training.lesson4;

public class MathDemo {

    public static void main(String[] args) {
        Math math = new Math();
        int result = math.min(10, 4);
        System.out.println(result);

        System.out.println(math.min(3, 4));
        System.out.println(math.min(1, 1));
    }

}
