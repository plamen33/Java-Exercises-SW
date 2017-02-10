public class LoanAccount {
    String IBAN;
    String owner;
    Double monthlyInterestRate;
    private Double balance;
    int perCom; // 1 - physical; 2 - organization

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
            months-=2;
            result = (balance/100)*monthlyInterestRate*months;
        }
        else if (perCom == 1){
            months-=3;
            result = (balance/100)*monthlyInterestRate*months;
        }

        return result;
    }
}
