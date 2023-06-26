package Practice.DateTimePractice;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @author Oksana Poliakova on 26.06.2023
 * @projectName Lesson1
 */

// Write a realisation of TemporalAdjuster, which will add 42 days to the date.

public class Task6 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime localDateTime = now.with(temporal -> temporal.plus(42L, ChronoUnit.DAYS));

        System.out.println(localDateTime);
    }
}
