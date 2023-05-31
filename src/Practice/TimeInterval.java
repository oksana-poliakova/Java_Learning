package Practice;

/**
 * @author Oksana Poliakova on 30.05.2023
 * @projectName Lesson1
 */
public class TimeInterval {
    // static can be only object, class can't be static
    private static final int SECONDS_IN_MINUTE = 60;
    private static final int MINUTES_IN_HOUR = 60;

    private static final int SECONDS_IN_HOUR = 3600;
    private final int hours;
    private final int minutes;
    private final int seconds;

    public TimeInterval(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public TimeInterval(int totalSeconds) {
        this.hours = totalSeconds / 3600;
        this.minutes = totalSeconds % 3600 / 60;
        this.seconds = totalSeconds % 3600 % 60;
    }

    public int totalSeconds() {
        return seconds + SECONDS_IN_MINUTE + hours * SECONDS_IN_HOUR;
    }

    public void print() {
        System.out.println("min: " + hours + ", minutes: " + minutes + ", seconds: " + seconds);
    }

    public TimeInterval sum(TimeInterval second) {
        return new TimeInterval(this.totalSeconds() + second.totalSeconds());
    }
}
