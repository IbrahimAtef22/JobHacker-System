package Week5.week5tasks.src;


import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchTask1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        boolean isThereException;

        do {
            try {
                System.out.println("Enter First Number: ");
                num1 = input.nextInt();
                isThereException = false;

            }catch (InputMismatchException ex){
                System.err.println("Invalid input. Please enter an integer.");
                input.next();
                isThereException = true;
            }

        } while (isThereException);


        do {
            try{
                System.out.println("\nEnter Second Number: ");
                num2 = input.nextInt();
                isThereException = false;

            }catch (InputMismatchException ex) {
                System.err.println("Invalid input. Please enter an integer.");
                input.next();
                isThereException = true;
            }

        } while (isThereException);

        input.close();

        int sum = num1 + num2;
        System.out.print("\nSum: " + sum);
    }
}
