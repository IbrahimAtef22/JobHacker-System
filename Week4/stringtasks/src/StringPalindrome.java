package Week4.stringtasks.src;

import java.util.Scanner;
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = input.nextLine();

        StringBuilder strbld = new StringBuilder(str);
        strbld.reverse();

        String reverseStr = strbld.toString();

        if (str.equals(reverseStr)){
            System.out.println("This string is a Palindrome.");
        }else {
            System.out.println("This string is not a Palindrome.");
        }
    }
}
