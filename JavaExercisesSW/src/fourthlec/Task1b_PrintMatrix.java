package fourthlec;

import java.util.Scanner;

public class Task1b_PrintMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        int d = 1;
        for (int col = 0; col < n; col++) {
            if (col == 0) {
                for (int row = 0; row < n; row++) {
                    matrix[row][col] = d;
                    d++;
                }
                continue;
            }
            if (col % 2 != 0) {
                for (int row = n - 1; row >= 0; row--) {
                    matrix[row][col] = d;
                    d++;
                }
            }
            if (col % 2 == 0) {
                for (int row = 0; row < n; row++) {
                    matrix[row][col] = d;
                    d++;
                }
            }
        }
        // Print matrix:
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }
}
