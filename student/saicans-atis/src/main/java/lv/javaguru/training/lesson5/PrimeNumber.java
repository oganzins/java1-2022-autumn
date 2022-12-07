package lv.javaguru.training.lesson5;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println(isPirme(1));
    }

        public static boolean isPirme(int number) {
        boolean isPrime = true;
        if (number != 0 && number != 1) {
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }
}
