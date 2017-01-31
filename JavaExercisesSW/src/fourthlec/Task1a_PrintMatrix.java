package fourthlec;

import java.util.Scanner;

public class Task1a_PrintMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        int d = 1;
        for (int col = 0; col < n; col++)
        {
            for (int row = 0; row < n; row++)
            {
                matrix[row][col] = d;
                d++;
            }
        }
        // Print matrix:
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix.length; col++)
            {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }
}
