package fintech.model;

import java.util.zip.DataFormatException;

/**
 * @author 12S23005 Ariella Sihombing
 * @author 12S23035 Julius Sinaga
 */
public class Transaction {
    private static int idCounter = 0;
    private int id;
    private Account account;
    private double amount;
    private String postedAt;
    private String note;

    public Transaction(Account _Account, double _amount, String _postedAt, String _note){
        this.id = ++idCounter;
        this.account = _Account;
        this.amount = _amount;
        this.postedAt = _postedAt;
        this.note = _note;
        account.addTransaction(amount);
    }

    public int getId(){
        return id;
    }

    public Account getAccount(){
        return account;
    }

    public double getAmount(){
        return amount;
    }

    public String getPostedAt(){
        return postedAt;
    }

    public String getNote(){
        return note;
    }

    @Override
    public String toString(){
        return id + "|" + account.getAccountName() + "|" + amount + "|" + postedAt + "|" + note;
    }
}