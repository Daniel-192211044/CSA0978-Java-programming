import java.util.Scanner;

class BankAccount {
    private String depositorName;
    private String accountNumber;
    private String accountType;
    private double balance;

    public BankAccount() {
        this.balance = 500.00;
    }

    public void readAccountDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        this.accountNumber = scanner.nextLine();

        System.out.print("Enter Depositor Name: ");
        this.depositorName = scanner.nextLine();

        System.out.print("Enter Account Type (Savings/Current): ");
        this.accountType = scanner.nextLine();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Amount deposited successfully. New balance: Rs." + this.balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (this.balance - amount >= 500.00) {
                this.balance -= amount;
                System.out.println("Amount withdrawn successfully. New balance: Rs." + this.balance);
            } else {
                System.out.println("Insufficient balance. Minimum balance of Rs.500.00 must be maintained.");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Current balance: Rs." + this.balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Scanner scanner = new Scanner(System.in);
        int choice;
        double amount;

        account.readAccountDetails();

        do {
            System.out.println("\n1. Deposit Amount");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    amount = scanner.nextDouble();
                    account.deposit(amount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    amount = scanner.nextDouble();
                    account.withdraw(amount);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
