import java.util.Scanner;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] letters = new int[26];

        for (char c : magazine.toCharArray()) {
            letters[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (letters[c - 'a'] == 0) {
                return false;
            }
            letters[c - 'a']--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the ransom note string: ");
        String ransomNote = scanner.nextLine();
        
        System.out.println("Enter the magazine string: ");
        String magazine = scanner.nextLine();
        
        boolean result = canConstruct(ransomNote, magazine);
        System.out.println("Can ransom note be constructed? " + result);
        
        scanner.close();
    }
}
