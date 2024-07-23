import java.util.Scanner;

public class taxcalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your income: ");
        double income = scanner.nextDouble();
        double tax = 0.0;

        if (income <= 150000) {
            tax = 0;
        } else if (income <= 300000) {
            tax = (income - 150000) * 0.10;
        } else if (income <= 500000) {
            tax = (income - 300000) * 0.20 + 15000;
        } else {
            tax = (income - 500000) * 0.30 + 55000;
        }

        System.out.println("Your calculated tax is: " + tax);
        
        scanner.close();
    }
}
