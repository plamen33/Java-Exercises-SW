import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Credentials process = new Credentials();
        String input;
        while(!(input = sc.nextLine()).equals("END")){

            String [] array = input.split("\\s+");
            String command = array[0];
            String userName = array[1];
            String password = array[2];
            String newPassword = "";
            if(command.equals("CHPASS")){
                newPassword = array[3];
            }

            switch(command){

                case "ENROLL": process.add(userName, password); break;
                case "AUTH": process.auth(userName, password); break;
                case "CHPASS": process.chpass(userName, password, newPassword); break;
            }
        }
  }
}