package week1.week1tasks.src.mytaskpackage;

import java.util.Scanner;

public class ArrayFillII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int T = input.nextInt();

        int[] N = new int[1000];

        int j = 0;
        int i = 0;

        // label for outer loop
        aa:
        while (i < N.length){
            while (j < T){
                N[i] = j;
                System.out.println("N["+i+"] = "+j);
                j++;
                i++;
                if(i >= N.length){
                    break aa;
                }
            }
            j = 0;

        }
    }
}
