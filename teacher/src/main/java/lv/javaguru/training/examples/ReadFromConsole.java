package lv.javaguru.training.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFromConsole {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> inputList = new ArrayList<>();

        String input = scan.nextLine();
        while (!input.equals("quit")) {
            inputList.add(input);
            input = scan.nextLine();
        }

        System.out.println(inputList);
    }

}
