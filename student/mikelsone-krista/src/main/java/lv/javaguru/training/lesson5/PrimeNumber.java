package lv.javaguru.training.lesson5;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }
    public static boolean isPrime(int number) {
        boolean isPrime = false;
        for (int i  = 2; i<= number; i++){
            if (number % i ==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
