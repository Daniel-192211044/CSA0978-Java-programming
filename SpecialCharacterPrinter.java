import java.util.Scanner;

public class SpecialCharacterPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();

        printSpecialCharacters(input);
    }

    public static void printSpecialCharacters(String input) {
        int specialCharCount = 0;

        System.out.println("Special characters in the line:");
        for (char ch : input.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                System.out.print(ch + " ");
                specialCharCount++;
            }
        }

        System.out.println();
        System.out.println("Number of special characters: " + specialCharCount);
    }
}
