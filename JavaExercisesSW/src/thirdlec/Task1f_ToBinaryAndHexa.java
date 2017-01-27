package thirdlec;

import java.util.Scanner;

public class Task1f_ToBinaryAndHexa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        String binary = Integer.toString(inputNumber, 2);
        String hexadecimal = Integer.toString(inputNumber, 16);
        System.out.println(binary);
        System.out.println(hexadecimal);
    }
}
