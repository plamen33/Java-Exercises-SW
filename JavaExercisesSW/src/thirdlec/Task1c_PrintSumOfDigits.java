package thirdlec;

import java.util.Scanner;

public class Task1c_PrintSumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int result = 0;
        char[] charArray = input.toCharArray();
        for (int i = input.length()-1; i >=0 ; i--) {
            result += Integer.parseInt(String.valueOf(charArray[i]));
        }
        System.out.println(result);
    }
}
