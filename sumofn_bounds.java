import java.util.Scanner;
public class sumofn_bounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements (N): ");
        int N = scanner.nextInt();
        int[] numbers = new int[N];
        int sum = 0;
        System.out.println("Enter " + N + " numbers:");
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }
        try {
            for (int i = 0; i <= N; i++) { 
                sum += numbers[i];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds at index: " + N);
        }
        System.out.println("Sum of the numbers: " + sum);
        scanner.close();
    }
}
