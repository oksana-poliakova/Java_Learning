package Basics.FunctionalProgramming.Stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.stream.Collectors;

/**
 * @author Oksana Poliakova on 25.06.2023
 * @projectName Lesson1
 */

public class ReaderRunner {
    public static void main(String[] args) throws IOException {
        File file = Path.of("resources", "test.txt").toFile();
        // provides more efficient reading of data from the file
        try(BufferedReader fileReader = new BufferedReader((new FileReader(file)))) {
            // returns a stream of lines from the file
            String collect = fileReader.lines()
                    .collect(Collectors.joining("\n"));
            System.out.println(collect);
        }
    }
}
