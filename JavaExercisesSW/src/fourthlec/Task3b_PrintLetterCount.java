package SwiftJava.fourthlec;

import java.util.*;
import java.util.stream.Collectors;

public class Task3b_PrintLetterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stringInput = sc.nextLine().toLowerCase();
        int lengthOfString = stringInput.length();
        Map<Character, Integer> numChars = new TreeMap<Character, Integer>();

        for (int i = 0; i < lengthOfString; ++i)
        {
            char charAt = stringInput.charAt(i);

            if (!numChars.containsKey(charAt))
            {
                numChars.put(charAt, 1);
            }
            else
            {
                numChars.put(charAt, numChars.get(charAt) + 1);
            }
        }
        for (Map.Entry<Character,Integer> entry : numChars.entrySet()) {

            System.out.printf("%s(%d)\n", entry.getKey(), entry.getValue());
        }
//        System.out.println(numChars);
    }
}
