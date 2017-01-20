package secondlec;

import java.util.Scanner;

public class Task5_SwapVariables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        // Solution 1
        String variable1 = sc.next();
        String variable2 = sc.next();
        String result = variable2 + " " +variable1;
        System.out.println(result);

//        // Solution 2
//        String variable1 = sc.next();
//        String variable2 = sc.next();
//        System.out.printf("%s %s", variable2, variable1);

//        // Solution 3
//        String[] variables = sc.nextLine().split(" ");
//        for (int i=1; i >= 0; i--){
//            System.out.printf("%s", variables[i]);
//            if (i == 1){
//                System.out.printf(" ");
//            }
//        }


    }
}
