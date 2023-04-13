package week1.week1tasks.src.mytaskpackage;

import java.util.Scanner;

public class Average2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double gradeA = input.nextDouble();
        double gradeB = input.nextDouble();
        double gradeC = input.nextDouble();
        // Average of grades
        double MEDIA = (gradeA * 2 + gradeB * 3 + gradeC * 5)/ (2+3+5);

        System.out.printf("MEDIA = %.1f",MEDIA);
        System.out.println();
    }
}
