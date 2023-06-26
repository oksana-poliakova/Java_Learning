package Practice.DateTimePractice;

import java.time.LocalDateTime;

/**
 * @author Oksana Poliakova on 26.06.2023
 * @projectName Lesson1
 */

/* Create an object of LocalDateTime with date of 05/03/2023.
Create a second object of LocalDateTime with a date in 3 months from the last date.
Output LocalDate and LocalTime.*/

public class Task1 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2023, 3, 5, 12, 42);
        LocalDateTime localDateTimeIn3Months = localDateTime.plusMonths(3L);

        System.out.println(localDateTimeIn3Months.toLocalDate());
        System.out.println(localDateTimeIn3Months.toLocalTime());
    }
}