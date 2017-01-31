package fourthlec;

import java.util.Scanner;

public class Task1c_PrintMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        int number = 1;

        int i = 1;
        int j = 1;
        for (int element = 1; element <= n * n; element++) {
            matrix[i - 1][j - 1] = element;
            if ((i + j) % 2 == 0) {
                // Even stripes
                if (j < n)
                    j++;
                else
                    i+= 2;
                if (i > 1)
                    i--;
            }
            else {
                // Odd stripes
                if (i < n)
                    i++;
                else
                    j+= 2;
                if (j > 1)
                    j--;
            }
        }

        // Print matrix:
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
