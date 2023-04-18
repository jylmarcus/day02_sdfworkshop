package sg.edu.nus.iss;

public class FixedDepositAccount extends BankAccount {
    
    //members
    private Float interest;
    private Integer duration;
    private Boolean interestChanged = false;
    private Boolean durationChanged = false;

    //constructors
    public FixedDepositAccount(String accountHolder, String accountNumber, Float accountBalance){
        super(accountHolder, accountNumber, accountBalance);
    }

    public FixedDepositAccount(String accountHolder, String accountNumber, Float accountBalance, Float interest){
        super(accountHolder, accountNumber, accountBalance);
        this.interest = 3f;
    }

    public FixedDepositAccount(String accountHolder, String accountNumber, Float accountBalance, Float interest, Integer duration){
        super(accountHolder, accountNumber, accountBalance);
        this.interest = 3f;
        this.duration = 6;
    }

    //getters and setters
    public Float getInterest() {
        return interest;
    }
    public void setInterest(Float interest) {
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

}
