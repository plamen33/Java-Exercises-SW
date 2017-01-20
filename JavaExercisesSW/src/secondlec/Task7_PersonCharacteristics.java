package secondlec;

import java.util.Scanner;

public class Task7_PersonCharacteristics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String lastName = sc.nextLine();
        short yearBorned = sc.nextShort();
        String weight = sc.next();
        short height = sc.nextShort();
        String occupation = sc.next();

        short years = (short) (2014 - yearBorned);
        System.out.printf("%s %s is %d years old. His weight is %s and he is %d cm tall. He is a %s.", name, lastName, years, weight, height, occupation);

        // IMHO this is a better Solution:
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        String lastName = sc.nextLine();
//        short yearBorned = sc.nextShort();
//        String weight = sc.next();
//        String height = sc.next();
//        String occupation = sc.next();
//
//        short years = (short) (2014 - yearBorned);
//        System.out.printf("%s %s is %d years old. His weight is %s and he is %s cm tall. He is a %s.", name, lastName, years, weight, height, occupation);


    }
}
