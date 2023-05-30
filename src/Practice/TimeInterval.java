package Practice;

/**
 * @author Oksana Poliakova on 30.05.2023
 * @projectName Lesson1
 */
public class TimeInterval {
    private int hours;
    private int minutes;
    private int seconds;

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
        return seconds + minutes * 60 + hours * 60 * 60;
    }

    public void print() {
        System.out.println("min: " + hours + ", minutes: " + minutes + ", seconds: " + seconds);
    }

    public TimeInterval sum(TimeInterval second) {
        return new TimeInterval(this.totalSeconds() + second.totalSeconds());
    }

}
