package Basics.FunctionalProgramming.Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Oksana Poliakova on 25.06.2023
 * @projectName Lesson1
 */
public class FilesRunner {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "test2.txt");
        Path path2 = Path.of("resources", "test.txt");

        Files.write(path, List.of("Hello World!", "Today is 25. June 2023", "I'm learning Java."));

        try (Stream<String> lines = Files.lines(path2)) {
           lines.forEach(System.out::println);
        }

    }
}
