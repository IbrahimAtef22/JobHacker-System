package week1.week1tasks.src.mytaskpackage;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double Distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1, 2));

        System.out.printf("%.4f",Distance);
        System.out.println();


    }
}
