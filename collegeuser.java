import java.util.Scanner;
public class collegeuser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total number of users: ");
        int totalUsers = scanner.nextInt();
        System.out.println("Enter the number of staff users: ");
        int staffUsers = scanner.nextInt();
        int nonTeachingStaff = staffUsers / 3;
        int studentUsers = totalUsers - staffUsers - nonTeachingStaff;
        System.out.println("Total users: " + totalUsers);
        System.out.println("Staff users: " + staffUsers);
        System.out.println("Non-teaching staff users: " + nonTeachingStaff);
        System.out.println("Student users: " + studentUsers);
        scanner.close();
    }
}
