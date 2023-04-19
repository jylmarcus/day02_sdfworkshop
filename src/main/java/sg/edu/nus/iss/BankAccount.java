package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.Date;

public class BankAccount {
    
    //members
    private final String accountHolder;
    private String accountNumber;
    private float accountBalance;
    private ArrayList<String> transactions;
    private boolean isClosed;
    private Date accountCreated;
    private Date accountClosed;

    //constructors
    public BankAccount(String accountHolder, String accountNumber){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.accountBalance = 0.0f;

        this.accountCreated = new Date();
        transactions = new ArrayList<>();
    }

    public BankAccount(String accountHolder, String accountNumber, float accountBalance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;

        this.accountCreated = new Date();
        transactions = new ArrayList<>();
    }

    //getters
    public String getAccountHolder() {
        return accountHolder;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public float getAccountBalance() {
        return accountBalance;
    }
    public ArrayList<String> getTransactions() {
        return transactions;
    }
    public boolean getIsClosed() {
        return isClosed;
    }
    public Date getAccountCreated() {
        return accountCreated;
    }
    public Date getAccountClosed() {
        return accountClosed;
    }

    //setters

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }
    public void setTransactions(ArrayList<String> transactions) {
        this.transactions = transactions;
    }
    public void setIsClosed(boolean isClosed) {
        this.isClosed = isClosed;

        setAccountClosed(new Date());
    }
    public void setAccountCreated(Date accountCreated) {
        this.accountCreated = accountCreated;
    }
    public void setAccountClosed(Date accountClosed) {
        this.accountClosed = accountClosed;
    }
    
    //randomly generate a string of 10 numbers for account number
    private String randomAccountNumber(){
        Integer[] randomNumbers = new Integer[10];
        Integer max = 9;
        Integer min = 0;
        Integer range = max-min + 1;

        for(int i=0; i<randomNumbers.length; i++){
            randomNumbers[i] = (int)(Math.random()*range) + min;
        }
        return randomNumbers.toString();
    }

    //methods
    @Override
    public String toString() {
        return "BankAccount [fullName=" + getAccountHolder() + ", accountNumber=" + getAccountNumber() + ", balance=" + getAccountBalance()
                + ", isClosed=" + isClosed + ", accountStartDate=" + getAccountCreated() + ", accountEndDate="
                + getAccountClosed() + "]";
    }

    public void deposit(float depositAmount){
        if(isClosed) {
            throw new IllegalArgumentException("Account has been closed. You cannot make a deposit to an inactive or closed account.");
        } else if(depositAmount <= 0) {
            throw new IllegalArgumentException("You cannot deposit a negative amount");
        } else {
            this.accountBalance += depositAmount;
            Date dt = new Date();
            String transaction = ("deposit $" + depositAmount + "to account " + getAccountNumber() + " at " + dt.toString());
            this.transactions.add(transaction);
        }
    }

    public void withdraw(float withdrawAmount){
        if(withdrawAmount <= 0){
            throw new IllegalArgumentException("You cannot withdraw a negative amount");
        } else if(withdrawAmount > this.getAccountBalance()){
            throw new IllegalArgumentException("Withdrawal amount is more than account balance");
        } else if(isClosed){
            throw new IllegalArgumentException("Account is closed. You cannot withdraw from a closed account");
        } else {
            this.accountBalance -= withdrawAmount;
            Date dt = new Date();
            String transaction = ("withdraw $" + withdrawAmount + "to account " + getAccountNumber() + " at " + dt.toString());
            this.transactions.add(transaction);
        }
    }
}
