package Week4.stringtasks.src;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = input.nextLine();

        StringBuilder strbld = new StringBuilder(str);
        System.out.print("Reversed string: "+strbld.reverse());
    }
}
