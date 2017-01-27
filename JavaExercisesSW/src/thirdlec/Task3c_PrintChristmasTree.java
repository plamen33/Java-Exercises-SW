package thirdlec;

import java.util.Scanner;

public class Task3c_PrintChristmasTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 3){
            System.out.print(" * \n");
            System.out.print(" * \n");
            System.out.print("***");
        }
        else if(num == 2){
            System.out.print(" * \n");
            System.out.print("***");
        }
        else if(num == 1){
            System.out.println("You cannot draw a tree with input = 1");
        }
        else if(num <= 0){
            System.out.println("You cannot draw a tree with such input number");
        }
        else{
            int last = 0;
            for(int i=1;i<=num-2;i++){
                for(int j=1; j<num-i-1; j++){
                    System.out.print(" ");
                }
                for(int k=1; k<=i; k++){
                    System.out.print("*");
                    for(int m=1; m<k; m+=k){
                        System.out.print("*");
                        if(i == num-2){last++;}
                    }
                    if(i == num-2){last++;}
                }
                System.out.println();
            }
            int spaces = last/2;
            System.out.print(repeatChar(' ', spaces) + "*"+ repeatChar(' ', spaces)+ "\n");
            System.out.print(repeatChar(' ', spaces-1) + "***"+ repeatChar(' ', spaces-1));
        }


    }
    static String repeatChar(char charToRepeat, int count){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(charToRepeat);
        }
        return sb.toString();
    }
}
