import java.util.Scanner;

public class NumberSquareArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        int[] numberSquareArray = new int[2];
        numberSquareArray[0] = number;
        numberSquareArray[1] = number * number;
        System.out.println("Array: [" + numberSquareArray[0] + ", " + numberSquareArray[1] + "]");
    }
}
