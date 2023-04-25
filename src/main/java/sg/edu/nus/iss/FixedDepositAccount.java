package sg.edu.nus.iss;

public class FixedDepositAccount extends BankAccount {
    
    //members
    private float interest;
    private Integer duration;
    private Boolean interestChanged = false;
    private Boolean durationChanged = false;

    //constructors
    
    public FixedDepositAccount(String accountHolder, String accountNumber) {
        super(accountHolder, accountNumber);
    }

    public FixedDepositAccount(String accountHolder, String accountNumber, float accountBalance){
        super(accountHolder, accountNumber, accountBalance);
    }

    public FixedDepositAccount(String accountHolder, String accountNumber, float accountBalance, float interest){
        super(accountHolder, accountNumber, accountBalance);
        this.interest = 3f;
    }

    public FixedDepositAccount(String accountHolder, String accountNumber, float accountBalance, float interest, Integer duration){
        super(accountHolder, accountNumber, accountBalance);
        this.interest = 3f;
        this.duration = 6;
    }

    //getters and setters
    public float getInterest() {
        return interest;
    }
    public void setInterest(float interest) {
        if(getInterestChanged()){
            throw new IllegalArgumentException("Interest has already been changed");
        } else {
            this.interest = interest;
            this.interestChanged = true;
        }
    }
    public Integer getDuration() {
        return duration;
    }
    public void setDuration(Integer duration){
        if(getDurationChanged()){
            throw new IllegalArgumentException("Duration has already been changed");
        } else {
            this.duration = duration;
            this.durationChanged = true;
        }
    }
    public Boolean getInterestChanged() {
        return interestChanged;
    }

    public Boolean getDurationChanged() {
        return durationChanged;
    }

    //methods
    public float getBalance() {
        return this.getAccountBalance() + this.getAccountBalance()*(this.getInterest()/100f);
    }

    @Override
    public void deposit(float depositAmount){System.out.println("No deposit allowed");}

    @Override
    public void withdraw(float withdrawAmount){System.out.println("No withdrawal allowed");}
}
