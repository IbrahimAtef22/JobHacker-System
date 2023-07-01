package week3.week3tasks.src.task1;

public class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Account() {

    }

    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // depositing method
    public void deposit(double amount){
        balance += amount;
        System.out.println(amount+" is deposited into Your Account");
        System.out.println("Your New Balance is "+balance);
    }

    // withdrawing method
    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println(amount+" is withdrawed from Your Account");
            System.out.println("Your New Balance is "+balance);
        }else{
            System.out.println("Your Balance is less than "+amount);
            System.out.println("Transaction is failed !!, please input an amount less than your balance");
        }
    }
}
