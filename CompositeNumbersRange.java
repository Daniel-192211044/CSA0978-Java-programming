import java.util.Scanner;

public class CompositeNumbersRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();
        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("Invalid range: a should be less than or equal to b.");
            return;
        }

        System.out.println("Composite numbers between " + a + " and " + b + ":");
        printCompositeNumbers(a, b);
    }

    public static void printCompositeNumbers(int a, int b) {
        for (int num = a; num <= b; num++) {
            if (num > 1 && isComposite(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static boolean isComposite(int num) {
        if (num < 4) {
            return false; // Numbers less than 4 are not composite
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }
}
