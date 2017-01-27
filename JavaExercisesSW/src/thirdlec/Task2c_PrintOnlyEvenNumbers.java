package thirdlec;

import java.util.Scanner;

public class Task2c_PrintOnlyEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        int result = 0;

        for (int i = 1; i <= input ; i++) {
            result = Integer.parseInt(sc.next());
            if(result%2 == 0){
                System.out.print(result + " ");
            }
        }

    }
}
