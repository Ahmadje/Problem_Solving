package AverageOfArray;
////////Average of Array////////////

import java.util.Scanner;

public class runner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5];
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter #" + (i+1) + ": ");
            arr[i]=in.nextInt();
            sum+=arr[i];
        }
        System.out.println("The Average ="+ (sum/ arr.length));
    }
}

