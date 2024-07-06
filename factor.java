import java.util.Scanner;
public class factor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.print("Factors of " + number + ": ");
        boolean foundFactor = false;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                foundFactor = true;
                System.out.print(i + " ");
            }
        }
        if (!foundFactor) {
            System.out.println("\nNo factors found.");
        }
        scanner.close();
    }
}
