package fourthlec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2e_LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int start = -1;
        int length = 0;
        int bestStart = 0;
        int bestLength = 1;
        int lastNum = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) { start = 0; length = 1; lastNum = array[i]; continue; }
            if (array[i] > lastNum) {
                length++;
                lastNum = array[i];
            }
            else {
                if (bestLength < length) {
                    bestStart = start;
                    bestLength = length;
                }
                start = i;
                length = 1;
                lastNum = array[i];
            }
        }

        if (bestLength >= length) {
            for (int i = bestStart; i < bestStart + bestLength; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
        else {
            for (int i = start; i < start + length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}

