import java.util.Scanner;

public class sumnatural_recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        int sum = sumRecursion(n);
        System.out.println("The sum of the first " + n + " natural numbers is " + sum);

        scanner.close();
    }

    public static int sumRecursion(int n) {
        if (n <= 1) {
            return n;
        }
        return n + sumRecursion(n - 1);
    }
}
