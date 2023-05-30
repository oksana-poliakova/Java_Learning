package Practice;

/**
 * @author Oksana Poliakova on 30.05.2023
 * @projectName Lesson1
 */
public class TimeIntervalRunner {
    public static void main(String[] args) {
        TimeInterval timeInterval1 = new TimeInterval(60, 22, 1);
        System.out.println(timeInterval1.totalSeconds());

        TimeInterval timeInterval2 = new TimeInterval(timeInterval1.totalSeconds());
        System.out.println(timeInterval2.totalSeconds());
        timeInterval2.print();

        TimeInterval sumIntervals = timeInterval1.sum(timeInterval2);
        sumIntervals.print();
    }
}
