import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Terminal {
    public static int global = 0;
    public static List<DepositAccount> deposits = new ArrayList<>();
    public static List<LoanAccount> loans = new ArrayList<>();
    public static List<MortgageAccount> mortgages = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while(!input.equals("END")){
            String[] array = input.split(" ");
            String command = array[0];
            switch(command){
                case "PUT": put(array); break;
                case "OPEN": open(array); break;
                case "GET": getM(array); break;
                case "INFO": info(array); break;
            }

            input = sc.nextLine();
        }
    }
    private static void getM(String[] array) {
        String check = array[1];
        double money = Double.parseDouble(array[2]);
        for (DepositAccount d: deposits) {
            if(d.owner.equals(check)){
                d.getMoney(money);
            }
            else if (d.IBAN.equals(check)){
                d.getMoney(money);
            }
        }
    }

    private static void open(String[] array) {
        global++;
        String name = array[1];
        String clientType = array[2];
        String accountType = array[3];
        double balance = Double.parseDouble(array[4]);
        double interest = Double.parseDouble(array[5]);
        if(accountType.equals("1")) {
            DepositAccount temp = new DepositAccount();
            if(clientType.equals("1")){
                temp.owner = name;
                temp.IBAN = ibanGenerator();
                temp.monthlyInterestRate = interest;
                temp.setBalance(balance);
                System.out.println(temp.IBAN);
                deposits.add(temp);
            }
            else if(clientType.equals("2")){
                temp.owner = name;
                temp.IBAN = ibanGenerator();
                temp.monthlyInterestRate = interest;
                temp.setBalance(balance);
                System.out.println(temp.IBAN);
                deposits.add(temp);
            }
        }
        else if(accountType.equals("2")) {
            LoanAccount temp = new LoanAccount();

            temp.owner = name;
            temp.IBAN = ibanGenerator();
            temp.monthlyInterestRate = interest;
            temp.setBalance(balance);
            System.out.println(temp.IBAN);
            if(clientType.equals("1")){
                temp.perCom = 1;
            }
            else if (clientType.equals("2")) {
                temp.perCom = 2;
            }
                loans.add(temp);
        }
        else if(accountType.equals("3")) {
            MortgageAccount temp = new MortgageAccount();

            temp.owner = name;
            temp.IBAN = ibanGenerator();
            temp.monthlyInterestRate = interest;
            temp.setBalance(balance);
            System.out.println(temp.IBAN);
            if(clientType.equals("1")){
                temp.perCom = 1;
            }
            else if (clientType.equals("2")) {
                temp.perCom = 2;
            }
            mortgages.add(temp);
        }
    }
    public static void info(String[] array) {
        String check = array[1];
        int months = Integer.parseInt(array[2]);
        for (DepositAccount d: deposits) {
         if(d.owner.equals(check)){
             double result = d.info(months);
             System.out.printf("%.2f\n", result);
         }
         else if(d.IBAN.equals(check)){
             double result = d.info(months);
             System.out.printf("%.2f\n", result);
         }
        } // end of deposit check
        for (MortgageAccount m: mortgages) {
            if (m.owner.equals(check)) {
                double result = m.info(months);
                System.out.printf("%.2f\n", result);
            } else if (m.IBAN.equals(check)) {
                double result = m.info(months);
                System.out.printf("%.2f\n", result);
            }
        }
        for (LoanAccount l: loans) {
            if (l.owner.equals(check)) {
                double result = l.info(months);
                System.out.printf("%.2f\n", result);
            } else if (l.IBAN.equals(check)) {
                double result = l.info(months);
                System.out.printf("%.2f\n", result);
            }
        }
    }
    public static void put(String[] array) {
        String check = array[1];
        double money = Double.parseDouble(array[2]);
        for (DepositAccount d: deposits) {
            if(d.owner.equals(check)){
                d.addBalance(money);
            }
            else if (d.IBAN.equals(check)){
                d.addBalance(money);
            }
        }
        for (LoanAccount l: loans) {
            if(l.owner.equals(check)){
                l.addBalance(money);
            }
            else if (l.IBAN.equals(check)){
                l.addBalance(money);
            }
        }
        for (MortgageAccount m: mortgages) {
            if(m.owner.equals(check)){
                m.addBalance(money);
            }
            else if (m.IBAN.equals(check)){
                m.addBalance(money);
            }
        }
    }
    private static String ibanGenerator() {
        String result = "";
       String temp = String.valueOf(global);
        int zeros = 9 - temp.length();
        if(zeros == 0){
            result = temp;
        }
        else{
            String z = String.valueOf(zeros);
            result = String.format("%0"+z+"d", global);
        }

     return result;
    }
}


// Test Input:
//OPEN peter 1 1 1982 0.88
//OPEN PgbLtd. 2 2 220000 0.45
//OPEN Svoge 2 3 1000000 0.22
//PUT peter 1000
//PUT 00000001 318
//INFO peter 41
//GET peter 2000
//INFO 00000001 41
//INFO Svoge 55
//END
//
//OPEN peter 1 1 1982 0.88
//OPEN PgbLtd. 2 2 220000 0.45
//OPEN Svoge 2 3 1000000 0.22
//PUT peter 1000
//PUT 00000001 318
//INFO peter 41
//GET peter 2000
//INFO 00000001 41
//INFO Svoge 55
//INFO 00000003 55
//END


