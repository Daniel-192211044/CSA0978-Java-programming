import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniquePermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("Unique permutations of " + number + ":");
        Set<String> uniquePermutations = findUniquePermutations(String.valueOf(number));
        for (String permutation : uniquePermutations) {
            System.out.println(permutation);
        }
    }

    public static Set<String> findUniquePermutations(String str) {
        Set<String> result = new HashSet<>();
        boolean[] used = new boolean[str.length()];
        backtrack(str.toCharArray(), used, new StringBuilder(), result);
        return result;
    }

    private static void backtrack(char[] chars, boolean[] used, StringBuilder current, Set<String> result) {
        if (current.length() == chars.length) {
            result.add(current.toString());
            return;
        }
        for (int i = 0; i < chars.length; i++) {
            if (used[i]) continue;
            current.append(chars[i]);
            used[i] = true;
            backtrack(chars, used, current, result);
            current.deleteCharAt(current.length() - 1);
            used[i] = false;
        }
    }
}
