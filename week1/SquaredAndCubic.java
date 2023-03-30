package week1;

import java.util.Scanner;

public class SquaredAndCubic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int multipleByIndex;

        for (int i = 1; i <= N; i++){

            multipleByIndex = i;
            System.out.print(multipleByIndex+" ");

            multipleByIndex *= i;
            System.out.print(multipleByIndex +" ");

            multipleByIndex *= i;
            System.out.println(multipleByIndex);
        }
    }
}
