package week1;

import java.util.Scanner;

public class EvenOddPositiveAndNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];
        // read 5 integers from user
        for (int i = 0; i < 5; i++){
            numbers[i] = input.nextInt();
        }

        int even = 0, odd = 0, positive = 0, negative = 0;

        for (int num : numbers) {
            if (num % 2 == 0){
                even++;
                if (num > 0){
                    positive++;
                }else if(num < 0){
                    negative++;
                }
            }else {
                odd++;
                if (num > 0){
                    positive++;
                }else if(num < 0){
                    negative++;
                }
            }
        }

        System.out.println(even+" valor(es) par(es)");
        System.out.println(odd+" valor(es) impar(es)");
        System.out.println(positive+" valor(es) positivo(s)");
        System.out.println(negative+" valor(es) negativo(s)");
    }
}
