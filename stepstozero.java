import java.util.Scanner;

public class stepstozero {
    public static int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            steps++;
        }
        return steps;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int num = scanner.nextInt();
        int steps = numberOfSteps(num);
        System.out.println("Number of steps to reduce " + num + " to zero: " + steps);
        scanner.close();
    }
}
