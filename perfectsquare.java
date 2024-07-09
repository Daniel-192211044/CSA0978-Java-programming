import java.util.Scanner;
public class perfectsquare{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the starting number of the range: ");
        int start = scanner.nextInt();
        System.out.println("Enter the ending number of the range: ");
        int end = scanner.nextInt();
        System.out.println("Perfect squares in the range with sum of digits less than 10:");
        for (int i = start; i <= end; i++) {
            if (isPerfectSquare(i) && sumOfDigits(i) < 10) {
                System.out.println(i);  }   }
        scanner.close();  }
    public static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;    }
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;        }
        return sum;  }}
