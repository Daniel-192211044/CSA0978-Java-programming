import java.util.Scanner;

public class perfectnumbers {
    
    public static boolean isPerfect(int number) {
        int sum = 1;
        
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        
        return sum == number && number != 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of perfect numbers to print:");
        int n = scanner.nextInt();

        int count = 0;
        int number = 2;

        System.out.println("The first " + n + " perfect numbers are:");

        while (count < n) {
            if (isPerfect(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }

        scanner.close();
    }
}
