package thirdlec;

import java.util.Scanner;

public class Task0e_ReadNNumbersOnNewLines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        String result = "";
        for (int i = 1; i <= n ; i++) {
            result += sc.nextLine();
            result+=" ";
        }
        System.out.println(result);
    }
}
