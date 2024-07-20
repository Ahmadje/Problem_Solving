package LeetCode.ThreeLetteresBetween_a_b;

import java.util.Scanner;

public class runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any String: ");
        String myString = input.nextLine();
        char[] myArray = myString.toCharArray();
        boolean result = false;
        for (int i = 0; i < myArray.length; i++) {
            if ('a' == myArray[i] && 'b'== myArray[i+4]) {
                result = true;
                break;
            }}
        System.out.println(result);
    }
}

