package fintech.model;

/**
 * @author 12S23005 Ariella Sihombing
 * @author 12S23035 Julius Sinaga
 */
public class Account {
    private String owner;
    private String accountName;
    private double balance;

    public Account(String _owner, String _accountName){
        this.owner = _owner;
        this.accountName = _accountName;
        this.balance = 0.0;
    }

    // Default
    public Account(){
        this.owner = "";
        this.accountName = "";
        this.balance = 0.0;
    }

    public String getOwner(){
        return owner;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void addTransaction(double _amount){
        this.balance += _amount;
    }
    
    @Override
    public String toString(){
        return accountName + "|" + owner + "|" + balance;
    }
}