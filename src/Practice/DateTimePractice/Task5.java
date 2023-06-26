package Practice.DateTimePractice;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author Oksana Poliakova on 26.06.2023
 * @projectName Lesson1
 */

// Create an object of Instant.
// Create another object based on the previous object based with timezone "Africa/Cairo"

public class Task5 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);

        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Africa/Cairo"));
        System.out.println(zonedDateTime);
    }
}
