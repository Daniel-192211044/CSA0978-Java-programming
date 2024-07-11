import java.util.Scanner;
public class sumofnaturalnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;  }
        System.out.println("The sum of the first " + n + " natural numbers is " + sum);
        scanner.close(); }}
