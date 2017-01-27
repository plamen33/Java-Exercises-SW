package thirdlec;


import java.util.Scanner;

public class Task0d_ReadNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n ; i++) {
            System.out.println(Integer.parseInt(sc.next()));
        }
    }
}
