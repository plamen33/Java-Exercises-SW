public class MortgageAccount {
    String IBAN;
    String owner;
    Double monthlyInterestRate;
    private Double balance;
    int perCom;   // 1 - physical; 2 - organization


    Double getBalance(){
        return balance;
    }
    void setBalance(Double b){
        this.balance = b;
    }
    void addBalance(Double b){
        this.balance += b;
    }
    double info(int months){
        double result = 0;
        if(perCom == 2){
         months-=12;
         result = (balance/100)*monthlyInterestRate*(0.5*12  +  months);
        }
        else if (perCom == 1){
            months-=6;
            result = (balance/100)*monthlyInterestRate*months;
        }

        return result;
    }
}
