package fourthlec;

import java.util.Arrays;
import java.util.Scanner;

public class Task2b_PrintSortedNumbers  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length ; i++) {
            array[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(array);
        System.out.println(String.join(" ",  Arrays.toString(array).replace("[","").replace("]", "").replace(",", "")));
    }
}
