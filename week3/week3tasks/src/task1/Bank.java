package week3.week3tasks.src.task1;

public class Bank {
    private Account[] accounts = new Account[50];
    static int i = 0;

    // addNewAccount method
    public void addNewAccount(Account account){
        if (i < accounts.length){
            accounts[i] = account;
            i++;
        }
    }

    // depositing method
    public boolean depositing(String accNum){
        boolean validAccount = true;
        for(int i = 0; i < accounts.length; i++){
            if (accounts[i].getAccountNumber() == accNum){
                validAccount = true;
            }else{
                validAccount = false;
            }
        }
        return validAccount;
    }
    // withdrawing method
    public boolean withdrawing(String accNum){
        boolean validAccount = true;
        for(int i = 0; i < accounts.length; i++){
            if (accounts[i].getAccountNumber() == accNum){
                validAccount = true;
            }else{
                validAccount = false;
            }
        }
        return validAccount;
    }
    // displayBalance
    public void displayBalance(double primBalance, double interest){
        double totalBalance = primBalance + interest;
        System.out.println("Your Total Balance = "+totalBalance);
    }
}
