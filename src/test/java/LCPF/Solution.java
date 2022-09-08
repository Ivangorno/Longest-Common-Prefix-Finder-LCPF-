package LCPF;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    static String s1;
    static String s2;
    static String s3;

    private static void input() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first word: ");
        s1 = input.nextLine();
        System.out.println("Enter the second word: ");
        s2 = input.nextLine();
        System.out.println("Enter the third word: ");
        s3 = input.nextLine();
    }
    public static String findPrefix() {

        StringBuilder commonPrefix = new StringBuilder();
        int shortestStr = s1.length();

        if (s1.length() > s2.length() && s2.length() < s3.length()) {
            shortestStr = s2.length();
        } else if (s1.length() > s3.length() && s2.length() > s3.length()) {
            shortestStr = s3.length();
        }

        for (int i = 0; i < shortestStr; i++) {
            if (s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i)) {
                commonPrefix.append(s1.charAt(i));
            } else {
                break;
            }
        }
        return commonPrefix.toString();
    }

    public static void main(String[] args) {
        input();
        System.out.println("Your LONGEST COMMON PREFIX is: \"" + findPrefix() + "\"");
    }
}


