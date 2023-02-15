package lv.javaguru.training.lesson15.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import static org.junit.jupiter.api.Assertions.*;

class ParallelStreamTest {

    @Test
    public void testStreamPerformance() {
        List<String> values = LongStream.range(0, 99)
                .parallel()
                .mapToObj(i -> {
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {

                    }
                    return "aaaaaaaaa";
                })
                .map(value -> value.toUpperCase())
                .collect(Collectors.toList());
    }

}