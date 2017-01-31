package fourthlec;
import java.util.Scanner;
import java.util.Arrays;
public class Task0c_PrintString {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		char[] array = input.toCharArray();
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
	}
}
