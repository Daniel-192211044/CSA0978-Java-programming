import java.util.Scanner;

public class insertsring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        System.out.print("Enter the string to be inserted: ");
        String insertString = scanner.nextLine();

        System.out.print("Enter the position to insert: ");
        int position = scanner.nextInt();

        String result = mainString.substring(0, position) + insertString + mainString.substring(position);
        System.out.println("Resulting string: " + result);

        scanner.close();
    }
}
