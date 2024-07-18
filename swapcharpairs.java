import java.util.Scanner;

public class swapcharpairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length - 1; i += 2) {
            char temp = charArray[i];
            charArray[i] = charArray[i + 1];
            charArray[i + 1] = temp;
        }

        String result = new String(charArray);
        System.out.println("Resulting string: " + result);

        scanner.close();
    }
}
