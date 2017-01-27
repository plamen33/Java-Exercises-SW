package thirdlec;

import java.util.Scanner;

public class Task2b_PrintReversedSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int[] array = new int[number];

        for (int i = 0; i < number ; i++) {
            array[i] = Integer.valueOf(sc.next());
        }
        for (int i = array.length-1; i >=0 ; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
