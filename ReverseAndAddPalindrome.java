import java.util.Scanner;

public class ReverseAndAddPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int result = number;
        int iteration = 0;

        while (!isPalindrome(result)) {
            int reversedNumber = reverseNumber(result);
            result = result + reversedNumber;
            iteration++;
            System.out.println("Iteration " + iteration + ": " + result);
        }

        System.out.println("Palindrome number: " + result);
    }

    public static boolean isPalindrome(int number) {
        int reversed = reverseNumber(number);
        return number == reversed;
    }

    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }
        return reversed;
    }
}
