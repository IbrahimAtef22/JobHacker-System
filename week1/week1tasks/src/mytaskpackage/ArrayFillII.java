package week1.week1tasks.src.mytaskpackage;

import java.util.Scanner;

public class ArrayFillII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // input number that you fill array from 0 to that number
        int numToFillArray = input.nextInt();
        // array to fill with 0 to number input
        int[] arrayToFill = new int[1000];

        int j = 0;
        int i = 0;

        // label for outer loop
        aa:
        while (i < arrayToFill.length){
            while (j < numToFillArray){
                arrayToFill[i] = j;
                System.out.println("N["+i+"] = "+j);
                j++;
                i++;
                if(i >= arrayToFill.length){
                    break aa;
                }
            }
            j = 0;

        }
    }
}
