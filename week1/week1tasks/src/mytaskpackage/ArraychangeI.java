package week1.week1tasks.src.mytaskpackage;

import java.util.Scanner;

public class ArraychangeI {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] N = new int[20];

        for (int i = 0; i < 20; i++){
            N[i] = input.nextInt();
        }

        int size = N.length;
        int temp;
        for (int i = 0; i < size; i++){
            if (i == 10){
                break;
            }
            temp = N[i];
            N[i] = N[size-1-i];
            N[size-1-i] = temp;
        }

        for (int i = 0; i < size; i++){
            System.out.println("N["+i+"] = "+N[i]);
        }
    }
}
