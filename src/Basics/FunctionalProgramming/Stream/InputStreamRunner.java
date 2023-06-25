package Basics.FunctionalProgramming.Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;

/**
 * @author Oksana Poliakova on 25.06.2023
 * @projectName Lesson1
 */

/* This code opens the "test.txt" file, reads its contents as bytes, converts the bytes into a string,
 and prints that string to the console. */

public class InputStreamRunner {
    public static void main(String[] args) throws IOException {
        // method is used to create a file path based on the provided arguments
        File file = Path.of("resources", "test.txt").toFile();
        // FileInputStream object to read data from the file, it opens a stream to read bytes from the specified file.
        try (FileInputStream newInputStream = new FileInputStream(file)) {
            // returns an array of bytes contained in the file
            byte[] bytes = newInputStream.readAllBytes();
            // converts the byte array into a string
            String stringValue = new String(bytes);
            System.out.println(stringValue);
        }
    }
}
