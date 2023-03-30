package week1;

import java.util.Scanner;

public class BelowTheMainDiagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // take character 'S' which means sum or 'M' which means average
        String O = input.nextLine().toUpperCase();

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
        int count = 0;

        // count sum of numbers below the main diagonal
        if (O.charAt(0) == 'S'){
            for (int i = 1; i < 12; i++){
                for (int j = 0; j < i; j++){
                    sum += M[i][j];
                }
            }
            System.out.printf("%.1f",sum);
            System.out.println();

        } else if (O.charAt(0) == 'M') {            // count average of numbers below the main diagonal
            for (int i = 1; i < 12; i++){
                for (int j = 0; j < i; j++){
                    sum += M[i][j];
                    count++;
                }
            }
            average = sum / count;
            System.out.printf("%.1f",average);
            System.out.println();
        }

    }
}
