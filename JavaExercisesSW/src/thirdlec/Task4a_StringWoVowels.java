package thirdlec;

import java.util.Scanner;

public class Task4a_StringWoVowels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = "";
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length ; i++) {
            if(!check(charArray[i])){
                result += charArray[i];
            }
        }
        System.out.println(result);
    }
    private static boolean check(char c) {
        switch (Character.toLowerCase(c)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y': return true;
            default: return false;
        }
    }
}
