public class DepositAccount {
    String IBAN;
    String owner;
    Double monthlyInterestRate;
    private Double balance;


    Double getBalance(){
        return balance;
    }
    void setBalance(Double b){
        this.balance = b;
    }
    void addBalance(Double b){
        this.balance += b;
    }
    void getMoney(Double b){
        this.balance -= b;
    }

    double info(int months){
      return (balance/100)*monthlyInterestRate*months ;
    }


}
