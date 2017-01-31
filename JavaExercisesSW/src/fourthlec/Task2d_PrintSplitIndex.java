package fourthlec;

import java.util.Scanner;

public class Task2d_PrintSplitIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length ; i++) {
            array[i] = Integer.parseInt(sc.next());
        }
        int a = 0;
        for (int i = 0; i < array.length; i++)
        {
            int leftSum = 0, rightSum = 0;
            for (int j = 0; j <= i; j++)
            { leftSum += array[j]; }
            for (int k = array.length-1; k > i; k--)
            { rightSum += array[k];}
            if (leftSum == rightSum) {
                System.out.println(i); a = 1; }
        }
        if(a == 0)
        { System.out.println("no"); }

    }
}
