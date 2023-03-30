package week1;

import java.util.Scanner;

public class Banknotes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        System.out.println(N);
        int numOfBanknotes;

        int[] banknotes = {100, 50, 20, 10, 5, 2, 1};

        for (int banknote : banknotes) {
            if(N < banknote){
                numOfBanknotes = 0;
                System.out.println(numOfBanknotes + " nota(s) de R$ " + banknote + ",00");
            }else{
                numOfBanknotes = N / banknote;
                N %= banknote;
                System.out.println(numOfBanknotes + " nota(s) de R$ " + banknote + ",00");
            }
        }

    }
}
