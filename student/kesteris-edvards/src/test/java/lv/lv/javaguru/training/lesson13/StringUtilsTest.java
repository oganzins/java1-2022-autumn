package lv.lv.javaguru.training.lesson13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class StringUtilsTest {

    @Test
    public void shouldConcatenateTwoStrings() {
        String first = "Hello ";
        String second = "World!";

        String result = StringUtils.concat(first, second);

        Assertions.assertEquals("Hello World!", result);
    }

    @Test
    public void shouldReturnFalseWhenEmpty() {
        boolean result = StringUtils.isEmpty("");

        Assertions.assertTrue(result);
    }

    @Test
    public void shouldConcatenateList() {
        List<String> parts = List.of("Hello", " ", "World", "!");
        String result = StringUtils.concat(parts);

        Assertions.assertEquals("Hello World!", result);
    }

}