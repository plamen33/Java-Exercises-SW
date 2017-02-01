package fifthlec.Task0_Classes;

import java.util.Scanner;

public class AworkwithPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputName = sc.nextLine();
        Integer inputYears;
        try{
            inputYears = Integer.parseInt(sc.nextLine());
        }
        catch (Exception e){
            inputYears = null;
        }
        Person newPerson;
        if (inputName.equals("") && inputYears == null){
            newPerson = new Person();
        }
        else if(!inputName.equals("") && inputYears == null){
            newPerson = new Person(inputName);
        }
        else{
            newPerson = new Person(inputName, inputYears);
        }

        newPerson.printNameAndAge(newPerson.getName(), newPerson.getYears());
    }
}
