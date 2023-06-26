package Practice.DateTimePractice;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * @author Oksana Poliakova on 26.06.2023
 * @projectName Lesson1
 */

// Create the object with today date. Create another object with different date.
// Find the number of days between these dates.

public class Task4 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate prevDate = LocalDate.of(2019, 12, 24);
        Period period = Period.between(prevDate, now);

        System.out.println(period.getDays());
        System.out.println(period.getMonths());
        System.out.println(period.getYears());

        long days = ChronoUnit.DAYS.between(prevDate, now);
        System.out.println(days);
    }
}
