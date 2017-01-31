package fourthlec;

import java.util.Scanner;


public class Task1d_PrintMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        int number = 1;

        int num=1, c1=0, c2=n-1, r1=0, r2=n-1;

        while(num<=n*n) {
            for(int i=c1;i<=c2;i++) {
                matrix[r1][i]=num++;
            }

            for(int j=r1+1;j<=r2;j++) {
                matrix[j][c2]=num++;
            }

            for(int i=c2-1;i>=c1;i--) {
                matrix[r2][i]=num++;
            }

            for(int j=r2-1;j>=r1+1;j--) {
                matrix[j][c1]=num++;
            }

            c1++;
            c2--;
            r1++;
            r2--;
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