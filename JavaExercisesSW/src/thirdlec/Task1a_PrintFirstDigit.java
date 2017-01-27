package thirdlec;

import java.util.Scanner;

public class Task1a_PrintFirstDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int digits = input.length();
        String num = "1";
        String a = "0";
        for (int i = 2; i <= digits; i++) {
            num +=  a;
        }
        int inputNumber = Integer.parseInt(input);
        int divider = Integer.parseInt(num);
        System.out.println(inputNumber/divider);
    }
}
