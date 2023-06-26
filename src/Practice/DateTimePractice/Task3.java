package Practice.DateTimePractice;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * @author Oksana Poliakova on 26.06.2023
 * @projectName Lesson1
 */

// We have a string like "26-06-2023T13:44". Get the object of LocalDateTime with date.
// Convert to instant object with timezone "America/Chicago".

public class Task3 {
    public static void main(String[] args) {
        String formattedDate = "26-06-2023T13:44";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        LocalDateTime localDateTime = LocalDateTime.parse(formattedDate, formatter);
        System.out.println(localDateTime);

        Instant instant = localDateTime.toInstant(ZoneId.of("America/Chicago").getRules().getOffset(localDateTime));
        System.out.println(instant);
    }
}
