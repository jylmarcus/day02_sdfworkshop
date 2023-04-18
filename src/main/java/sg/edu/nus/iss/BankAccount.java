package sg.edu.nus.iss;

import java.util.ArrayList;

public class BankAccount {
    
    //members
    private String accountHolder;
    private String accountNumber;
    private Float accountBalance;
    private ArrayList<String> transactions;
    private Boolean closed;
    private String accountCreated;
    private String accountClosed;

    //getters
    public String getAccountHolder() {
        return accountHolder;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public Float getAccountBalance() {
        return accountBalance;
    }
    public ArrayList<String> getTransactions() {
        return transactions;
    }
    public Boolean getClosed() {
        return closed;
    }
    public String getAccountCreated() {
        return accountCreated;
    }
    public String getAccountClosed() {
        return accountClosed;
    }

    //setters
    public void setAccountBalance(Float accountBalance) {
        this.accountBalance = accountBalance;
    }
    public void setTransactions(ArrayList<String> transactions) {
        this.transactions = transactions;
    }
    public void setClosed(Boolean closed) {
        this.closed = closed;
    }
    public void setAccountCreated(String accountCreated) {
        this.accountCreated = accountCreated;
    }
    public void setAccountClosed(String accountClosed) {
        this.accountClosed = accountClosed;
    }
    
}
