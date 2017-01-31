package fourthlec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Task2h_PrintOddFrequencyNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int result = 0;
        for (int i = 0; i < n; i++) {
            result = result ^ array[i];
        }
        System.out.println(result);
    }
}
