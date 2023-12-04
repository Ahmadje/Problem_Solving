package ThreeLetteresBetween_a_b;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        int n = 0;
        while (n < 10) {
            int a = n + 2; // 7
            int b = a + n; // 12
            System.out.println("a = " + a);
            n++;
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("n = " + n);
        }
    }
}
