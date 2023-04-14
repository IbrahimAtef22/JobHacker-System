package week3.week3tasks.src.task1;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("*** Welcome To My Bank System App ***");
            System.out.println("Please choose your operation from the list!");
            System.out.println("1- Add New Account.");
            System.out.println("2- Depositing.");
            System.out.println("3- Withdrawing.");
            System.out.println("4- Display your balance.");
            System.out.println("5- Exit.");

            int operation = input.nextInt();
            input.nextLine();

            switch (operation){
                case 1:
                    System.out.println("Enter account Number:");
                    String accNum = input.nextLine();
                    System.out.println("Enter account HolderName:");
                    String accHolderName = input.nextLine();
                    System.out.println("Enter account balance:");
                    double balance = input.nextDouble();
                    Account newAccount = new Account(accNum,accHolderName,balance);

                    Bank bankAccount = new Bank();
                    bankAccount.addNewAccount(newAccount);
                    break;
                case 2:
                    System.out.println("Enter your account number:");
                    accNum = input.nextLine();
                    System.out.println("Enter your amount:");
                    double amount = input.nextDouble();
                    Bank bankAccount1 = new Bank();
                    boolean isValidAccount = bankAccount1.depositing(accNum);
                    if (isValidAccount == true){
                        Account account = new Account();
                        account.deposit(amount);
                    }else{
                        System.out.println("This account is not exist, please enter a valid account.");
                    }

                    break;
                case 3:
                    System.out.println("Enter your account number:");
                    accNum = input.nextLine();
                    System.out.println("Enter your amount:");
                    amount = input.nextDouble();
                    Bank bankAccount2 = new Bank();
                    isValidAccount = bankAccount2.depositing(accNum);
                    if (isValidAccount == true){
                        Account account = new Account();
                        account.withdraw(amount);
                    }else{
                        System.out.println("This account is not exist, please enter a valid account.");
                    }
                    break;
                case 4:
                    Bank bankAccount3 = new Bank();
                    SavingsAccount saveAccount = new SavingsAccount();
                    Account account = new Account();
                    double primBalance = account.getBalance();
                    double interest = saveAccount.calculateInterest(primBalance);
                    bankAccount3.displayBalance(primBalance, interest);

                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Number!!, please choose a valid one.");
            }
        }
    }
}
