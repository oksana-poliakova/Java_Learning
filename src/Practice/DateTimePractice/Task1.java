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


  //      * 3. We have a string like "26-06-2023T13:44". Get the object of LocalDateTime with date. Convert to instant object with timezone "America/Chicago".
    //    * 4. Create the object with today date. Create another object with different date. Find the number of days between these dates.