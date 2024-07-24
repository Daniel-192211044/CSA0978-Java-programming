import java.util.Scanner;

public class LCMAndGCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int gcd = findGCD(numbers);
        int lcm = findLCM(numbers);

        System.out.println("GCD of the numbers: " + gcd);
        System.out.println("LCM of the numbers: " + lcm);
    }
    public static int findGCD(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = gcd(result, numbers[i]);
        }
        return result;
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to find the LCM of two numbers
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Method to find the LCM of an array of numbers
    public static int findLCM(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = lcm(result, numbers[i]);
        }
        return result;
    }
}
