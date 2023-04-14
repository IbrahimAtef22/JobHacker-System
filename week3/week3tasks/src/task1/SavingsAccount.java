package week3.week3tasks.src.task1;

public class SavingsAccount extends Account{
    private static final float interestRate = 0.05f;


    // calculateInterest method
    public double calculateInterest(double balance){
        double interest = balance * interestRate;
        return interest;
    }
}
