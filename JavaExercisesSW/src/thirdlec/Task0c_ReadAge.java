package thirdlec;

import java.util.Scanner;

public class Task0c_ReadAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=0 && age<18){
            System.out.println("Човекът е непълнолетен");
        }
        else if(age >= 18){
            System.out.println("Човекът е пълнолетен");
        }

    }
}
