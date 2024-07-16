import java.util.Scanner;
public class duplicatechar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        int[] charCount = new int[256]; // Assuming ASCII characters
        for (char c : str.toCharArray()) {
            charCount[c]++;}
        System.out.println("Duplicate characters in the string are:");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i + ": " + charCount[i]);}}
        scanner.close();
    }
}
