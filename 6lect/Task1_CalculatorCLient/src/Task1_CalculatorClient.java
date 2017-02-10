import java.util.Scanner;

public class Task1_CalculatorClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String input;
        while(!(input = sc.nextLine()).equals("END")){

            String[] array = input.split(" ");
            String word = array[0];
            Double a = Double.parseDouble(array[1]);
            Double b = Double.parseDouble(array[2]);

            switch (word){

                case "SUM": calculator.sum(a,b); break;
                case "MUL": calculator.multiply(a,b); break;
                case "PER": calculator.percentage(a,b); break;
                case "DIV": calculator.divide(a,b); break;
                case "SUB": calculator.subtract(a,b); break;
            }
        }
    }
}
