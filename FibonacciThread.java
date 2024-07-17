import java.util.Scanner;

class FibonacciRunnable implements Runnable {
    private int n;

    public FibonacciRunnable(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        generateFibonacciSeries(n);
    }

    private void generateFibonacciSeries(int n) {
        if (n < 1) return;
        int a = 0, b = 1;
        System.out.print(a);
        if (n > 1) {
            System.out.print(" " + b);
        }
        for (int i = 3; i <= n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }
}

public class FibonacciThread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        scanner.close();

        FibonacciRunnable fibRunnable = new FibonacciRunnable(n);
        Thread thread = new Thread(fibRunnable);
        thread.start();

        try {
            thread.join(); // Wait for the thread to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
