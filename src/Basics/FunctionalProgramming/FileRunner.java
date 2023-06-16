package Basics.FunctionalProgramming;

/**
 * @author Oksana Poliakova on 16.06.2023
 * @projectName Lesson1
 */

import java.io.File;
import java.io.IOException;

/**
 *             output stream
 * application ---------> file
 *
 *             input stream
 *  * application <--------- file
 *
 */

public class FileRunner {
    public static void main(String[] args) throws IOException {
        File file = new File("resources/test.txt");
        file.createNewFile();
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
    }
}
