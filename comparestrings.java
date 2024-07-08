import java.util.Scanner;
public class comparestrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.println("Enter second string: ");
        String str2 = scanner.nextLine();
        if (str1.equals(str2)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
        scanner.close();
    }
}
