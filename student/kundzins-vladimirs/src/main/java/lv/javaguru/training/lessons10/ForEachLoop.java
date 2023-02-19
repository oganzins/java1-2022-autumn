package lv.javaguru.training.lessons10;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for(Integer number : numbers){
        System.out.println(number);
        }
    }
}

