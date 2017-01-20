package secondlec;

import java.util.Scanner;

public class Task2_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputYear = sc.nextInt();
        if (inputYear%100 == 0){
            if(inputYear%400 == 0){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
        else{
            if(inputYear%4 == 0){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }

    }
}
