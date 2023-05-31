package week1.week1tasks.src.mytaskpackage;

import java.util.Scanner;

public class ColumnInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // take column number to make operation on it
        int C = input.nextInt();
        input.nextLine();
        // take character 'S' which means sum or 'M' which means average
        String T = input.nextLine().toUpperCase();

        // 2D array with 12 rows and 12 columns
        double[][] M = new double[12][12];

        // take array elements from user
        for (int i = 0; i < 12; i++){
            for (int j = 0; j < 12; j++){
                M[i][j] = input.nextDouble();
            }
        }

        double sum = 0;
        double average;

        // count sum of numbers in array column
        if (T.charAt(0) == 'S'){
            for (int j = 0; j < 12; j++){
                sum += M[j][C];
            }
            System.out.printf("%.1f",sum);
            System.out.println();

        } else if (T.charAt(0) == 'M') {        // count average of numbers in array column
            for (int j = 0; j < 12; j++){
                sum += M[j][C];
            }
            average = sum / 12;
            System.out.printf("%.1f",average);
            System.out.println();
        }
    }
}
