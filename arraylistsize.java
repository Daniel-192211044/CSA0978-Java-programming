import java.util.ArrayList;
import java.util.Scanner;

public class arraylistsize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Enter elements for the ArrayList (type 'done' to finish):");
        while (true) {
            String element = scanner.nextLine();
            if (element.equalsIgnoreCase("done")) {
                break;
            }
            list.add(element);
        }

        System.out.println("ArrayList: " + list);
        System.out.println("Size of the ArrayList: " + list.size());

        scanner.close();
    }
}
