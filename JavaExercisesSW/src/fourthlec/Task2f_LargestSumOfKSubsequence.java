package fourthlec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Task2f_LargestSumOfKSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        sc.nextLine();
        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        //System.out.println(Arrays.toString(array));
        int firstIndex = 0;
        int lastIndex = array.length -1;
        int[] tempArray = new int[k];
        int[] resultArray = new int[k];
        int sum = 0;
        int largestSum = 0;
        while(firstIndex+k<=lastIndex){
            int indexL = firstIndex+k - 1;
            int j = 0;
            for (int i = firstIndex; i <= indexL ; i++) {
                tempArray[j] = array[i];
                sum += array[i];
                if (largestSum < sum){
                  resultArray =  Arrays.copyOfRange(tempArray, 0, tempArray.length);
                }
                j++;
            }
            firstIndex++;
        }
        System.out.println(String.join(" ", Arrays.toString(resultArray).replaceAll("\\[|\\]|,|\\s", " ").replace("  "," ").trim()));
    }
}

