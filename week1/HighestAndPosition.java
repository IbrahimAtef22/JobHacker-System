package week1;

import java.util.Scanner;

public class HighestAndPosition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[100];

        for (int i = 0; i < 100; i++){
            numbers[i] = input.nextInt();
        }

        int highest = 0;
        int index = 0;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > highest){
                highest = numbers[i];
                index = i;
            }
        }
        index++;
        int position = index;
        // the highest of all integers
        System.out.println(highest);
        // the position of the highest integer
        System.out.println(position);

    }
}
