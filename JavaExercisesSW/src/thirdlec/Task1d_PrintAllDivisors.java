package thirdlec;
import java.util.Scanner;

public class Task1d_PrintAllDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.print("1 ");
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        if (num!=1) {
            System.out.println(num);
        }
        scanner.close();
    }
}
