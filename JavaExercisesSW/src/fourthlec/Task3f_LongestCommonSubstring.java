package fourthlec;

import java.util.Scanner;
public class Task3f_LongestCommonSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String temp ="";
        if (a.length() > b.length()) {
            temp = b;
            b = a;
            a = temp;
        }
        String res = "";
        for (int ai = 0; ai < a.length(); ai++) {
            for (int len = a.length() - ai; len > 0; len--) {

                for (int bi = 0; bi < b.length() - len; bi++) {

                    if (a.regionMatches(ai, b, bi, len) && len > res.length()) {
                        res = a.substring(ai, ai + len);
                    }
                }
            }
        }
        System.out.println(res);
    }
}