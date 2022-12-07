package Lesson5.homework;

public class SumOf10 {

    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        do {
            if (i >= 1)
                sum += i;
            i++;

        } while (i <= 10);


        System.out.println("Total sum of numbers from 0 to 10 is " + sum);
    }}
