package lv.javaguru.training.lesson2.ClassWork;

import java.util.Random;

public class RandomNumberGenerator {

    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt();
        System.out.println(randomNumber);
    }
}
