package thirdlec;

import java.util.Scanner;

public class Task4c_PrintEverySentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\.|\\!|\\?");
        for (String sentence:input) {
            System.out.println(sentence.trim());
        }
    }
}
