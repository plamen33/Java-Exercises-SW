package secondlec;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task4_InchToCm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inchesInput = sc.nextFloat();
        double result = (inchesInput*2.54);
        DecimalFormat df = new DecimalFormat("###.####");
        System.out.printf(df.format(result));

    }
}
