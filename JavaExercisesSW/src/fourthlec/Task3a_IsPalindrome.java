package fourthlec;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task3a_IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stringInput = sc.nextLine();
        char[] array = stringInput.toCharArray();

        int backCount = array.length-1;
        int forwardCount = 0;
        boolean check = false;
        while (forwardCount < backCount){
            if(forwardCount > array.length-1 || backCount< 0){
                break;
            }
            if(array[forwardCount] != array[backCount]){
                System.out.println("false");
                check = true;
                break;
            }
            forwardCount++;
            backCount--;
        }
        if(!check) {
            System.out.println("true");
        }
    }
}
