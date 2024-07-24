import java.util.Scanner;

public class VoterEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        int minimumVotingAge = 18;

        if (age >= minimumVotingAge) {
            System.out.println("You are eligible to vote.");
        } else {
            int yearsLeft = minimumVotingAge - age;
            System.out.println("You are not eligible to vote.");
            System.out.println("You need " + yearsLeft + " more years to be eligible.");
        }
    }
}
