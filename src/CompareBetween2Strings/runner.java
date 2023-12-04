package CompareBetween2Strings;

import java.util.Scanner;

////////Get Factorial of Number entered by user ////////////

public class runner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1,s2;
        System.out.println("Enter First String");
        s1 = in.nextLine();
        System.out.println("Enter Second String");
        s2 = in.nextLine();
        if (s1.compareTo(s2) > 0)
            System.out.println("First String is greater than second string");
        else if (s2.compareTo(s1) > 0)
            System.out.println("Second String is greater than first string");
        else System.out.println("Two Strings are equals");
    }
}

