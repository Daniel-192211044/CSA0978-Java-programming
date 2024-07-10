import java.util.Scanner;
class PrimeCheckThread extends Thread {
    private int number;
    private boolean isPrime = true;
    public PrimeCheckThread(int number) {
        this.number = number;
    }
    public void run() {
        if (number <= 1) {
            isPrime = false;
            return;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                return;
            }
        }
    }
    public boolean isPrime() {
        return isPrime;
    }
}
public class threadprimeornot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        PrimeCheckThread primeCheckThread = new PrimeCheckThread(number);
        primeCheckThread.start();
        try {
            primeCheckThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (primeCheckThread.isPrime()) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        scanner.close();
    }
}