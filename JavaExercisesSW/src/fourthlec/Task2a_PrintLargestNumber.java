package fourthlec;

import java.util.Scanner;

public class Task2a_PrintLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int max = -939294937;
        for (int i = 0; i < array.length ; i++) {
            array[i] = Integer.parseInt(sc.next());
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
