import java.util.Scanner;

public class yearstoday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age in years: ");
        int age = scanner.nextInt();
        int daysLived = (int)(age * 365.25);
        System.out.println("You have lived approximately " + daysLived + " days.");
        scanner.close();
    }
}
