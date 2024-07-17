import java.util.Scanner;
public class lastwordlength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s = scanner.nextLine();

        System.out.println("Length of the last word: " + lengthOfLastWord(s));

        scanner.close();
    }

    public static int lengthOfLastWord(String s) {
        int length = 0;
        boolean isWord = false;

        // Traverse the string from the end
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                isWord = true;
                length++;
            } else if (isWord) {
                // If a word has been started and we encounter a space, break the loop
                break;
            }
        }

        return length;
    }
}
