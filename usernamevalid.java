import java.util.Scanner;
public class usernamevalid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a username: ");
        String username = scanner.nextLine();
        if (isValidUsername(username)) {
            System.out.println("Username is valid.");
        } else {
            System.out.println("Username is invalid.");
        }
        scanner.close();
    }
    public static boolean isValidUsername(String username) {
        if (username.length() < 5 || username.length() > 15) {
            return false;
        }   
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }
        
        return true;
    }
}
