import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        int count = countCharacters(sentence);
        System.out.println("The total number of characters in the sentence is: " + count);

        scanner.close();
    }

    public static int countCharacters(String sentence) {
        return sentence.length();
    }
}
