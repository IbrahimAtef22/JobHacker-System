package Week5.week5tasks.src;


import java.util.Scanner;

public class InputMismatchTask1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        boolean isThereException;

        do {
            System.out.print("Enter First Number: ");
            if (input.hasNextInt()) {
                num1 = input.nextInt();
                isThereException = false;

            } else {
                System.out.println("Invalid input. Please enter an integer.");
                input.next();
                isThereException = true;
            }

        } while (isThereException);


        do {
            System.out.print("\nEnter Second Number: ");
            if (input.hasNextInt()) {
                num2 = input.nextInt();
                isThereException = false;

            } else {
                System.out.println("Invalid input. Please enter an integer.");
                input.next();
                isThereException = true;
            }

        } while (isThereException);

        input.close();

        int sum = num1 + num2;
        System.out.print("\nSum: " + sum);
    }
}
