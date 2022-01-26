package Week3;
import java.lang.Math;
import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public int getNumberOfYears() {
        return numberOfYears;
    }
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }
    public double getLoanAmount() {
        return loanAmount;
    }
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
    public java.util.Date getLoanDate() {
        return loanDate;
    }
    public void setLoanDate(java.util.Date loanDate) {
        this.loanDate = loanDate;
    }

    public double getMonthlyPayment() {
        double value = (this.loanAmount * (getAnnualInterestRate()/12)) / (1 - (1/Math.pow((1+(annualInterestRate/12)),(numberOfYears*12))));
        return value;
    }

    public double getTotalPayment() {
        double value = getMonthlyPayment() * numberOfYears * 12;
        return value;
    }

}
