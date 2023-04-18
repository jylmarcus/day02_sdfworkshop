package sg.edu.nus.iss;

public class FixedDepositAccount extends BankAccount {
    
    //members
    private Float interest;
    private Integer duration;
    private Boolean interestChanged = false;
    private Boolean durationChanged = false;

    //getters and setters
    public Float getInterest() {
        return interest;
    }
    public void setInterest(Float interest) throws Exception {
        if(getInterestChanged()){
            throw new Exception("IllegalArgumentException");
        } else {
            this.interest = interest;
            setInterestChanged(true);
        }
    }
    public Integer getDuration() {
        return duration;
    }
    public void setDuration(Integer duration) throws Exception{
        if(getDurationChanged()){
            throw new Exception("IllegalArgumentException");
        } else {
            this.duration = duration;
            setDurationChanged(true);
        }
    }
    public Boolean getInterestChanged() {
        return interestChanged;
    }
    public void setInterestChanged(Boolean interestChanged) {
        this.interestChanged = interestChanged;
    }
    public Boolean getDurationChanged() {
        return durationChanged;
    }
    public void setDurationChanged(Boolean durationChanged) {
        this.durationChanged = durationChanged;
    }

}
