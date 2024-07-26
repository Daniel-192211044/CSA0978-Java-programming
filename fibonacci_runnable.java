import java.util.Scanner;

class FibonacciRunnable implements Runnable {
    private int count;

    public FibonacciRunnable(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        generateFibonacci(count);
    }

    private void generateFibonacci(int count) {
        if (count <= 0) {
            System.out.println("Invalid count. Please enter a positive integer.");
            return;
        }

        long a = 0, b = 1;
        System.out.println("Fibonacci series up to " + count + " terms:");
        System.out.print(a);

        for (int i = 1; i < count; i++) {
            System.out.print(", " + b);
            long next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}

public class fibonacci_runnable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms for Fibonacci series: ");
        int terms = scanner.nextInt();

        FibonacciRunnable fibonacciRunnable = new FibonacciRunnable(terms);
        Thread fibonacciThread = new Thread(fibonacciRunnable);

        fibonacciThread.start();

        try {
            fibonacciThread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        scanner.close();
    }
}
