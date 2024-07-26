import java.util.Scanner;

class MultiplicationTableThread extends Thread {
    private int number;
    private int range;

    public MultiplicationTableThread(int number, int range) {
        this.number = number;
        this.range = range;
    }

    @Override
    public void run() {
        try {
            System.out.println("Multiplication table for " + number + ":");
            for (int i = 1; i <= range; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number for multiplication table: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the range for the multiplication table: ");
        int num2 = scanner.nextInt();

        MultiplicationTableThread thread = new MultiplicationTableThread(num1, num2);

        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        scanner.close();
    }
}
