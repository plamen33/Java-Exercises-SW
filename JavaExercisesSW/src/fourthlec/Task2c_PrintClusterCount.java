package fourthlec;

        import java.util.Arrays;
        import java.util.Scanner;

public class Task2c_PrintClusterCount  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length ; i++) {
            array[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(array);
        int result = 0;
        boolean check = false;
        for(int i = 1; i < array.length; i++) {
            if(array[i] == array[i - 1] && check == false) {
               check = true;
            }
            else if(array[i] != array[i - 1] && check == true){
              result++;
              check = false;
            }

           }
        if(check == true){result++;}
        System.out.println(result);
        }
    }
