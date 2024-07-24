import java.util.Scanner;

public class Reverseusingloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        String reversedWord = reverseWord(word);

        System.out.println("Reversed word: " + reversedWord);
    }

    public static String reverseWord(String word) {
        String reversed = "";
        int length = word.length();

        for (int i = length - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        return reversed;
    }
}
