package lv.javaguru.training.lesson15.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStream {

    public static void main(String[] args) {
        List<String> values = IntStream.range(0, 999999)
                .mapToObj(i -> "aaaaaaaaa")
                .map(value -> value.toUpperCase())
                .collect(Collectors.toList());
    }

}
