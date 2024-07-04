import java.util.Scanner;
public class fiveprint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String userinput = scan.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.println( userinput);
        }
        scan.close(); // Close the scanner
    }
}
