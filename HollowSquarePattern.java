import java.util.Scanner;

public class HollowSquarePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the symbol to print: ");
        char symbol = scanner.next().charAt(0);

        System.out.print("Enter the size of the square: ");
        int size = scanner.nextInt();

        printHollowSquare(symbol, size);
    }

    public static void printHollowSquare(char symbol, int size) {
        if (size < 2) {
            System.out.println("Size should be at least 2.");
            return;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Print symbol for the border
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print(symbol + " ");
                } else {
                    // Print space for the hollow part
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
