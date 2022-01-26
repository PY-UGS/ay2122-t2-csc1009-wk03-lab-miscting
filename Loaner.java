package Week3;
import java.util.*;

public class Loaner {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        float intRate = input.nextFloat();
        intRate = intRate / 100;

        System.out.print("Enter number of years as an integer: ");
        int noOfYears = input.nextInt();

        System.out.print("Enter loan amount, for example, 120000.95: ");
        float loanAmt = input.nextFloat();

        input.close();

        Loan newloaner = new Loan(intRate, noOfYears, loanAmt);

        System.out.println("The loan was created on " + newloaner.getLoanDate());
        System.out.println("The monthly payment is " + String.format("%.02f",newloaner.getMonthlyPayment()));
        System.out.println ("The total payment is " + String.format("%.02f",newloaner.getTotalPayment()));

        
    }

}