package fourthlec;

public class Task0d_Print2dArray {
	public static void main(String[] args){
		int a = 1;
		for(int row = 0; row < 4; row++){
			System.out.println(a);
			for(int col = 0; col < 4; col++){
				System.out.print(a);
				a++;
			}
		}
	}
}
