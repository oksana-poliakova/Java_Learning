package Basics.Serialization;

import java.io.*;
import java.nio.file.Path;

/**
 * @author Oksana Poliakova on 25.06.2023
 * @projectName Lesson1
 */
public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Path path = Path.of("resources", "student.txt");
        writeObject(path);
        readObject(path);
    }

    private static void writeObject(Path path) throws IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
            TestPerson person1 = new TestPerson(22, "Alice");
            objectOutputStream.writeObject(person1);
        }
    }

    private static void readObject(Path path) throws IOException, ClassNotFoundException {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path.toFile()))) {
            Object object = objectInputStream.readObject();
            System.out.println(object);
        }
    }
}
