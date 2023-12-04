package FactorialOfNumber;

import java.util.Scanner;

////////Get Factorial of Number entered by user ////////////

public class runner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an Number to calculate it`s factorial");
        int num = in.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = i * fact;
        }
        System.out.println("Factorial of #" + num + "= " + fact);
    }
}

