package fourthlec;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Task3d_BracketMatching {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        System.out.println(checkBraces(inputString));
        sc.close();
    }

    static boolean checkBraces(String inputString){
        Stack<Character> charStack = new Stack<Character>();
        boolean check = false;
        char tempChar;
        Character[] openingBraces = {'[','(','{'};
        Character[] closingBraces = {']',')','}'};
        List<Character> openingBracesList = Arrays.asList(openingBraces);
        List<Character> closingBracesList = Arrays.asList(closingBraces);

        if(inputString == null){
            return  check;
        }
        else if(inputString.length()==0){
            check = true;
        }
        else{

            for(int i=0; i < inputString.length(); i++) {
                tempChar = inputString.charAt(i);

                if(openingBracesList.contains(tempChar)){
                    charStack.push(tempChar);
                }
                else if(closingBracesList.contains(tempChar)){
                    if(!charStack.isEmpty()){
                        if(tempChar==')' && '(' != charStack.pop()){
                            return  check;
                        }
                        else if(tempChar=='}' && '{' !=charStack.pop()){
                            return  check;
                        }
                        else if(tempChar==']' && '[' != charStack.pop()){
                            return  check;
                        }
                    }
                    else{
                        return  check;
                    }
                }
                else{
                    return  check;
                }
            }

        }

        if( charStack.isEmpty()){
            check = true;
            return  check;
        }
        else{
            return  check;
        }
    }
}
