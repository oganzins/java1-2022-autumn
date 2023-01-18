package lv.javaguru.training.examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SimpleFileReadString {

    public static void main(String[] args) throws IOException {
        Path filePath = Path.of(".\\teacher\\src\\main\\java\\lv\\javaguru\\training\\assist\\demo.txt");
        String content = Files.readString(filePath);

        System.out.println(content);
    }

}
