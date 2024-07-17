import java.util.Scanner;

public class countcharacteruntil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int numberCount = 0;
        char ch;

        System.out.println("Enter characters (press '*' to stop):");

        while (true) {
            ch = scanner.next().charAt(0);
            if (ch == '*') {
                break;
            }

            if (Character.isUpperCase(ch)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            }
        }

        scanner.close();

        System.out.println("Uppercase letters: " + upperCaseCount);
        System.out.println("Lowercase letters: " + lowerCaseCount);
        System.out.println("Numbers: " + numberCount);
    }
}
