import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class removeduplicates{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }        
        int[] uniqueArray = removeDuplicates(array);        
        System.out.println("Array with unique elements: " + Arrays.toString(uniqueArray));
        scanner.close();
    }
    public static int[] removeDuplicates(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int item : array) {
            set.add(item);
        }   
        int[] result = new int[set.size()];
        int index = 0;
        for (int item : set) {
            result[index++] = item;
        }
        return result;
    }
}