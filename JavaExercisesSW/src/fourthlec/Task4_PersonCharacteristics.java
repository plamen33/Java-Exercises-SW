package fourthlec;
import java.util.*;

public class Task4_PersonCharacteristics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input =sc.nextLine().split(";");
            String firstName = input[0];
            String lastName = input[1];
            String gender = input[2];
            int year = Integer.parseInt(input[3]);
            double weight = Double.parseDouble(input[4]);
            int height = Integer.parseInt(input[5]);
            String occupation = input[6];
            double average = 0.0;
            for (int a = 7; a <= 10 ; a++) {
                average += Double.parseDouble(input[a]);
            }
            average = average/4;
            int years = 2017-year;
            if (gender.equals("M")){
                System.out.printf("%s %s is %d years old. He was born in %d. His weight is %.1f and he is %d cm tall. He is a %s with average grade of %.3f.", firstName, lastName, years, year, weight, height, occupation, average);
                if (years<18){
                    System.out.printf(" %s %s is under-aged.", firstName, lastName);
                    System.out.println();
                }
                else{
                    System.out.println();
                }
            }
            else if (gender.equals("F")){
                System.out.printf("%s %s is %d years old. She was born in %d. Her weight is %.1f and she is %d cm tall. She is a %s with average grade of %.3f.\n", firstName, lastName, years, year, weight, height, occupation, average);
                if (years<18){
                    System.out.printf(" %s %s is under-aged.", firstName, lastName);
                    System.out.println();
                }
                else{
                    System.out.println();
                }
            }
        }
    }
}
