import java.util.Scanner;
public class concatanatestring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = scanner.nextLine();
        String concatenatedString = str1.concat(str2);
        System.out.println("Concatenated String: " + concatenatedString);
        scanner.close();
    }
}
