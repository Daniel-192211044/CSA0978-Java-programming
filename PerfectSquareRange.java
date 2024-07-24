import java.util.ArrayList;
import java.util.Scanner;

public class PerfectSquareRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();
        System.out.println("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();
        ArrayList<Integer> result = findPerfectSquares(lowerBound, upperBound);
        System.out.println("Perfect squares in the range with sum of digits less than 10:");
        for (int num : result) {
            System.out.println(num);
        }
        scanner.close();
    }
    public static ArrayList<Integer> findPerfectSquares(int lowerBound, int upperBound) {
        ArrayList<Integer> perfectSquares = new ArrayList<>();

        for (int i = (int) Math.ceil(Math.sqrt(lowerBound)); i <= Math.floor(Math.sqrt(upperBound)); i++) {
            int square = i * i;
            if (sumOfDigits(square) < 10) {
                perfectSquares.add(square);
            }
        }
        return perfectSquares;
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
