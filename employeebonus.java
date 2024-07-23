import java.util.Scanner;

public class employeebonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the salary of the employee:");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        
        System.out.println("Enter the grade of the employee (A/B):");
        char grade = scanner.nextLine().charAt(0);

        double bonusPercentage = 0;

        if (grade == 'A' || grade == 'a') {
            bonusPercentage = 5;
        } else if (grade == 'B' || grade == 'b') {
            bonusPercentage = 10;
        }

        if (salary < 10000) {
            bonusPercentage += 2;
        }

        double bonus = (bonusPercentage / 100) * salary;
        double totalSalary = salary + bonus;

        System.out.println("The bonus for the employee is: $" + bonus);
        System.out.println("The total salary of the employee after bonus is: $" + totalSalary);

        scanner.close();
    }
}
