import java.util.Arrays;
import java.util.Scanner;
public class duplicatezeroes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();}
        duplicateZeros(arr);
        System.out.println("Array after duplicating zeros: " + Arrays.toString(arr));
        scanner.close(); }
    public static void duplicateZeros(int[] arr) {
        int possibleDups = 0;
        int length = arr.length - 1;
        for (int left = 0; left <= length - possibleDups; left++) {
            if (arr[left] == 0) {
                if (left == length - possibleDups) {
                    arr[length] = 0;
                    length -= 1;
                    break;
                }
                possibleDups++;
            }
        }

        int last = length - possibleDups;

        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }
    }
}
