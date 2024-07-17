import java.util.Scanner;
public class PrimeCheckRunnable implements Runnable {
    private int number;
    public PrimeCheckRunnable(int number) {
        this.number = number;
    }
    @Override
    public void run() {
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime: ");
        int number = scanner.nextInt();
        scanner.close();
        PrimeCheckRunnable primeCheckRunnable = new PrimeCheckRunnable(number);
        Thread thread = new Thread(primeCheckRunnable);
        thread.start();
    }
}
