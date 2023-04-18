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

    //constructors
    public BankAccount(){
        
    }

    public BankAccount(String accountHolder){
        this.accountHolder = accountHolder;
        setAccountBalance((float)0);
    }

    public BankAccount(String accountHolder, Float accountBalance){
        this.accountHolder = accountHolder;
        setAccountBalance((float)accountBalance);
    }

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
    
    //randomly generate a string of 10 numbers for account number
    private String randomAccountNumber(){
        Integer[] randomNumbers = new Integer[10];
        Integer max = 9;
        Integer min = 0;
        Integer range = max-min + 1;

        for(Integer i=0; i<randomNumbers.length; i++){
            randomNumbers[i] = (int)(Math.random()*range) + min;
        }
        return randomNumbers.toString();
    }

    //methods
    public void deposit(Float depositAmount) throws Exception{
        if(depositAmount > 0) {
            this.accountBalance += depositAmount;
            String transaction = ("deposit $" + depositAmount + " at <date time>");
            this.transactions.add(transaction);
        } else {
            throw new Exception("IllegalArgumentException");
        }
    }

    public void withdraw(Float withdrawAmount) throws Exception{
        if(withdrawAmount <= 0 || withdrawAmount > this.getAccountBalance()){
            throw new Exception("IllegalArgumentException");
        } else {
            this.accountBalance -= withdrawAmount;
            String transaction = ("withdraw $" + withdrawAmount + "at <date time>");
            this.transactions.add(transaction);
        }
    }
}
