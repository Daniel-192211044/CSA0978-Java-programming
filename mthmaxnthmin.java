import java.util.Arrays;
import java.util.Scanner;
public class mthmaxnthmin {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }        
        System.out.print("Enter the value of m:");
        int m = scanner.nextInt();
        System.out.print("Enter the value of n:");
        int n = scanner.nextInt();        
        if (m > size || n > size || m <= 0 || n <= 0) {
            System.out.println("Invalid values for m or n. They should be between 1 and the size of the array.");
            return;
        }
        Arrays.sort(array);
        int mthMax = array[size - m];
        int nthMin = array[n - 1];
        int sum = mthMax + nthMin;
        int difference = mthMax - nthMin;
        System.out.println("The " + m + "th maximum value is: " + mthMax);
        System.out.println("The " + n + "th minimum value is: " + nthMin);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        scanner.close();
    }
}