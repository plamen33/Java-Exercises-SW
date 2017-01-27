package thirdlec;

import java.util.Scanner;

public class Task1e_IsPrime {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        boolean numM = n > 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i == 0 ) {
                numM  = false;
                break;
            }
        }
        if (numM )   {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
