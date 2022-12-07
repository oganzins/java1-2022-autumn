package lv.javaguru.training.lesson6;

import java.util.Arrays;

public class TwoDimensionalArraysWithInitilaziation {
    public static void main(String[] args) {
        int[][] number = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < number.length; i++) {
            System.out.println(Arrays.toString(number[i]));
        }
    }
}
