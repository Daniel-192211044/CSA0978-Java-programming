import java.util.Scanner;
public class binarytodecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        String binary = scanner.nextLine();
        int decimal = Integer.parseInt(binary,2);
        System.out.println("The decimal equivalent is " + decimal);
        scanner.close();
    }
}
