package lv.javaguru.training.lessons11.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringReader {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Set<String> inputValues = new HashSet<>();

        String value = input.next();

        while(!value.equals("quit")){
            inputValues.add(value);
            value = input.next();
        }

        System.out.println(inputValues);
    }
}
