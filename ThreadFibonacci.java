import java.util.Scanner;
class FibonacciThread extends Thread {
    private int n;
    private long[] fibonacciSeries;
    public FibonacciThread(int n) {
        this.n = n;
        fibonacciSeries = new long[n];
    }
    public void run() {
        if (n >= 1) fibonacciSeries[0] = 0;
        if (n >= 2) fibonacciSeries[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
        }
    }
    public long[] getFibonacciSeries() {
        return fibonacciSeries;
    }
}
public class ThreadFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        FibonacciThread fibonacciThread = new FibonacciThread(n);
        fibonacciThread.start();
        try {
            fibonacciThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long[] fibonacciSeries = fibonacciThread.getFibonacciSeries();
        System.out.println("Fibonacci sequence up to " + n + " terms:");
        for (long num : fibonacciSeries) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}