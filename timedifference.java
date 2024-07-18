import java.util.Scanner;
class Time {
    int hours;
    int minutes;
    Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }
    Time subtract(Time t) {
        int totalMinutes1 = this.hours * 60 + this.minutes;
        int totalMinutes2 = t.hours * 60 + t.minutes;
        int diffMinutes = Math.abs(totalMinutes1 - totalMinutes2);
        int diffHours = diffMinutes / 60;
        diffMinutes = diffMinutes % 60;
        return new Time(diffHours, diffMinutes);
    }
}
public class timedifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first time period (HH MM) in 24-hour format: ");
        Time t1 = new Time(scanner.nextInt(), scanner.nextInt());
        System.out.println("Enter second time period (HH MM) in 24-hour format: ");
        Time t2 = new Time(scanner.nextInt(), scanner.nextInt());
        Time diff = t1.subtract(t2);
        System.out.println("Difference: " + diff.hours + " hours and " + diff.minutes + " minutes");
        scanner.close();
    }
}
