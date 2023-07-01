package week3.week3tasks.src.task1;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();

    // addNewAccount method
    public void addNewAccount(Account account){
        if (account != null){
            accounts.add(account);
        }
    }

    // isExistAccount method
    public boolean isExistAccount(String accNum){
        boolean validAccount = false;
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accNum)) {
                validAccount = true;
                break;
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
