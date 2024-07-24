import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class CommonElementsarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the first array:");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter the size of the second array:");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        ArrayList<Integer> commonElements = findCommonElements(array1, array2);
        System.out.println("Common elements: " + commonElements);

        scanner.close();
    }

    public static ArrayList<Integer> findCommonElements(int[] array1, int[] array2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        ArrayList<Integer> commonElements = new ArrayList<>();

        for (int num : array1) {
            set1.add(num);
        }

        for (int num : array2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }

        commonElements.addAll(set2);
        return commonElements;
    }
}
