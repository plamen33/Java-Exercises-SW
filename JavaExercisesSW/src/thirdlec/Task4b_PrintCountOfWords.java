package thirdlec;

import java.util.Scanner;

public class Task4b_PrintCountOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String[] s= sc.nextLine().split("[,.?!:;\\s+]");
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            String word = s[i];

            boolean check = false;
            for (int j = 0; j < word.length() ; j++) {
                char c = word.charAt(j);
                if (!(c>=65 && c<=90 || c>=97&& c<=122||c==39)){

                    check = true;
                    break;
                }
            }
            if(!check){
                count++;
            }
        }
        System.out.println(count);
    }
 }

