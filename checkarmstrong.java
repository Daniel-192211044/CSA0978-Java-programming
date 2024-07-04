import java.util.Scanner;

public class checkarmstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower bound: ");
        int lower = scanner.nextInt();

        System.out.print("Enter the upper bound: ");
        int upper = scanner.nextInt();

        System.out.println("Armstrong numbers between " + lower + " and " + upper + " are:");
        for (int i = lower; i <= upper; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            sum += Math.pow(remainder, digits);
            originalNumber /= 10;
        }

        return sum == number;
    }
}
