import java.util.Scanner;
public class skipnumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("value of m: ");
        int m = scanner.nextInt();
        System.out.print("value of n: ");
        int n = scanner.nextInt();
        System.out.print("k number to skip: ");
        int k = scanner.nextInt();
        for (int i = m; i <= n; i += (k + 1)) {
            System.out.println(i);
        }
        scanner.close();
    }
}