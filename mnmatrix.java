import java.util.*;

public class mnmatrix {
    public static int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int[] soldierCount = new int[m];
        for (int i = 0; i < m; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                } else {
                    break;
                }
            }
            soldierCount[i] = count;
        }
        int[][] sortedRows = new int[m][2];
        for (int i = 0; i < m; i++) {
            sortedRows[i][0] = soldierCount[i];
            sortedRows[i][1] = i;
        }
        Arrays.sort(sortedRows, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            } else {
                return a[1] - b[1];
            }
        });

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = sortedRows[i][1];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the matrix:");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] mat = new int[m][n];
        System.out.println("Enter the elements of the matrix (1 for soldier, 0 for civilian):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the number of weakest rows to find (k):");
        int k = scanner.nextInt();
        int[] weakestRows = kWeakestRows(mat, k);
        System.out.println("Indices of the k weakest rows:");
        for (int index : weakestRows) {
            System.out.println(index);
        }
        scanner.close();
    }
}
