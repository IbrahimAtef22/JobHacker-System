package week3.week3tasks.src.task2;

import java.util.Scanner;

public class ValidParentheses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        boolean result = isValid(s);
        System.out.println(result);
    }
    public static boolean isValid(String s) {
        if (s.length() % 2 == 1 || s.isEmpty()) {
            return false;
        }
        while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
        }
        return s.isEmpty();

    }

}
