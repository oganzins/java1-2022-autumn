package lv.javaguru.training.lesson13;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

class StringUtilsTest {

    private static List<String> parts;

    @BeforeAll
    public static void setUp() {
        parts = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            parts.add("X");
        }
    }

    @Test
    public void shouldConcatenateTwoStrings() {
        String first = "Hello ";
        String second = "World!";

        String result = StringUtils.concat(first, second);

        Assertions.assertEquals("Hello World!", result);
    }

    @Test
    public void shouldThrowExceptionWhenNull() {
        Assertions.assertThrows(NullPointerException.class,
                () -> StringUtils.isEmpty(null)
        );
    }

    @Test
    public void shouldReturnTrueWhenEmpty() {
        boolean result = StringUtils.isEmpty("");

        Assertions.assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenNotEmpty() {
        boolean result = StringUtils.isEmpty("Hello World!");

        Assertions.assertFalse(result);
    }

    @Test
    public void shouldConcatenateList() {
        List<String> parts = List.of("Hello", " ", "World", "!");
        String result = StringUtils.concat(parts);

        Assertions.assertEquals("Hello World!", result);
    }

    @Test
    @Timeout(value = 200, unit = TimeUnit.MILLISECONDS)
    public void shouldConcatenateListFast() {
        String result = StringUtils.concat(parts);

        Assertions.assertFalse(result.isEmpty());
    }


}