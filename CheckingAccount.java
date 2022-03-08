public class CheckingAccount{
    private String accountNumber;
    private Float balance; 

    public CheckingAccount(String accountNumber, Float balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public float deposit(float num){
        balance += num;
        return balance;        
    }

    public float withdraw(float num) throws InsufficientFundsException{
        if(balance < num)
            throw new InsufficientFundsException(num-balance);
        balance -= num;
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Float getBalance() {
        return balance;
    }

    
}
