import java.util.Scanner;
public class missingnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array (n): ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();}
        int missingNumber = findMissingNumber(nums, n);
        System.out.println("The missing number is: " + missingNumber);
        scanner.close();}
    public static int findMissingNumber(int[] nums, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num; }
        return expectedSum - actualSum;}}
