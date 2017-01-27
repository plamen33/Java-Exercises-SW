package thirdlec;

import java.util.Scanner;

public class Task5_PersonCharacteristics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int personCount = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= personCount ; i++) {
            String firstName = "", lastName = "", occupation ="";
            int year = 0;
            double weight = 0;
            double height = 0;
            while(true){
                System.out.println("Type valid firstName: ");
                firstName = sc.nextLine();
                try{
                    double num2 = Double.parseDouble(firstName);
                    continue;
                }
                catch(Exception e){
                    if (firstName.equals("")){continue;}
                    if(firstName.contains(".")||firstName.contains(",")||firstName.contains(":")){
                        continue;}
                    else{ break;}
                }
            }
            while(true){
                System.out.println("Type valid lastName: ");
                lastName = sc.nextLine();

                try{
                    double num2 = Double.parseDouble(lastName);
                    continue;
                }
                catch(Exception e){
                    if (lastName.equals("")){continue;}
                    else{ break;}
                }
            }
            while(true){
                System.out.println("Type valid born year: ");
                try{
                    year = Integer.parseInt(sc.nextLine());
                    break;
                }
                catch(Exception e){
                    continue;
                }
            }
            while(true){
                System.out.println("Type valid person weight: ");
                try{
                    weight = Double.parseDouble(sc.nextLine());
                    break;
                }
                catch(Exception e){
                    continue;
                }
            }
            while(true){
                System.out.println("Type valid person height: ");
                try{
                    height = Double.parseDouble(sc.nextLine());
                    break;
                }
                catch(Exception e){
                    continue;
                }
            }
            while(true){
                System.out.println("Type valid person occupation: ");
                occupation = sc.nextLine();

                try{
                    double num = Double.parseDouble(occupation);
                    continue;
                }
                catch(Exception e){
                    if (occupation.equals("")){continue;}
                    if(occupation.contains(",.")){continue;}
                    else{ break;}
                }
            }
            int years = 2017-year;
            System.out.printf("%s %s is %d years old. He was born in %d. His weight is %f and he is %.0f cm tall. He is a %s.", firstName, lastName, years, year, weight, height, occupation);
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
