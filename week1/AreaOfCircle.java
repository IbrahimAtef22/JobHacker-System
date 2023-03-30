package week1;

import java.util.Scanner;

// Calculate the area of Circle
public class AreaOfCircle {
    public static void main(String[] args) {
        final double π = 3.14159;
        Scanner input = new Scanner(System.in);
        // Radius of Circle
        double R = input.nextDouble();
        // calculate area of circle
        double A = π * R * R;

        System.out.printf("A=%.4f",A);
        System.out.println();


    }
}
