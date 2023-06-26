package Practice.DateTimePractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Oksana Poliakova on 26.06.2023
 * @projectName Lesson1
 */

// Create an object with today date. Convert to string like "DD.MM.YYYY".

public class Task2 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.of(2000, 2,2, 11, 11,11);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        DateTimeFormatter formatterWithTime = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

        String format = now.format(formatter);
        String formatWithTime = dateTime.format(formatterWithTime);

        System.out.println(format);
        System.out.println(formatWithTime);
    }
}
