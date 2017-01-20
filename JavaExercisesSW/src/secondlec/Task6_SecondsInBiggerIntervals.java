package secondlec;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Task6_SecondsInBiggerIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputSeconds = sc.nextInt();
        long days = TimeUnit.SECONDS.toDays(inputSeconds);
        long hours = TimeUnit.SECONDS.toHours(inputSeconds) - (days*24);
        long minutes = TimeUnit.SECONDS.toMinutes(inputSeconds) - (TimeUnit.SECONDS.toHours(inputSeconds)*60);
        long seconds = TimeUnit.SECONDS.toSeconds(inputSeconds) - (TimeUnit.SECONDS.toMinutes(inputSeconds)*60);

        System.out.printf("%d days, %d hours, %d minutes, %d seconds", days, hours, minutes, seconds);
    }
}
