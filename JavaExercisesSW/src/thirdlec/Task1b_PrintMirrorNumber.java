package thirdlec;

import java.util.Scanner;

public class Task1b_PrintMirrorNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = "";
        char[] charArray = input.toCharArray();
        for (int i = input.length()-1; i >=0 ; i--) {
            result += charArray[i];
        }
        System.out.println(result);
    }
}
