import java.util.Scanner;
public class n_primenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.println("Enter the number of primes to print after nth prime: ");
        int count = scanner.nextInt();
        int primeCount = 0;
        int num = 2;
        int lastPrime = 0;
        while (primeCount < n) {
            if (isPrime(num)) {
                lastPrime = num;
                primeCount++;   }
            num++;  }
        int primesPrinted = 0;
        while (primesPrinted < count) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                primesPrinted++; }
            num++;    }
        scanner.close();    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;}    }
        return true;  }}
