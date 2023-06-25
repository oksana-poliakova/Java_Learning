package Basics.FunctionalProgramming.Stream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

/**
 * @author Oksana Poliakova on 25.06.2023
 * @projectName Lesson1
 */
public class WriterRunner {
    public static void main(String[] args) throws IOException {
        File file = Path.of("resources", "writer.poem").toFile();
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file, true))) {
            fileWriter.append("Hello World!");
            fileWriter.newLine();
            fileWriter.append("Learning Java in progress...");
        }
    }
}
