package fourthlec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Task2g_LargestSumSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int maxSum = Integer.MIN_VALUE, maxEnd = 0;
        int firstIndex = 0;
        int lastIndex = 0;
        for (int i = 0; i < array.length; i++) {
            maxEnd = maxEnd + array[i];
            if (maxSum < maxEnd) {
                maxSum = maxEnd;
                lastIndex = i;
            }

            if (maxEnd < 0){
                maxEnd = 0;
                firstIndex = i;
            }
        }
        for (int i = firstIndex+1; i <= lastIndex ; i++) {
            System.out.print(array[i]+ " ");
        }
    }
}