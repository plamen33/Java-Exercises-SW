package fourthlec;

import java.util.*;

public class Task3c_CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stringInput = sc.nextLine();
        String code = sc.nextLine();
        char[] charArray = stringInput.toCharArray();
        char[] resultArray = new char[charArray.length];
        if(code.equals("encode")){
            for (int i = 0; i < charArray.length ; i++) {
                if ((charArray[i]>=65 && charArray[i]<=90)||(charArray[i]>=97 && charArray[i]<=122)){
                    if (charArray[i] == 'z'){
                        resultArray[i] = 'a';
                    }
                    else if(charArray[i] == 'Z'){
                        resultArray[i] = 'A';
                    }
                    else{
                        resultArray[i] = (char)(charArray[i]+1);
                    }
                }
                else{
                    resultArray[i] = charArray[i];
                }
            }

        }
        else if (code.equals("decode")){
            for (int i = 0; i < charArray.length ; i++) {
                if ((charArray[i]>=65 && charArray[i]<=90)||(charArray[i]>=97 && charArray[i]<=122)){
                    if (charArray[i] == 'a'){
                        resultArray[i] = 'z';
                    }
                    else if(charArray[i] == 'A'){
                        resultArray[i] = 'Z';
                    }
                    else{
                        resultArray[i] = (char)(charArray[i]-1);
                    }
                }
                else{
                    resultArray[i] = charArray[i];
                }
            }
        }
        System.out.println(String.join("",  Arrays.toString(resultArray).replace("[","").replace("]", "").replace(", ", "")));
    }
}
