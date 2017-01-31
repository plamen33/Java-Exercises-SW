package fourthlec;
import java.util.Scanner;
import java.util.Arrays;
public class Task0b_ReadArray {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		
		int[] array = new int[n];
		for(int i = 0; i<array.length; i++){
			array[i] = Integer.valueOf(sc.next());
		}
		System.out.println(String.join(" ", Arrays.toString(array).replaceAll("\\[|\\]", "").replaceAll(", ",",")));
	}
}
