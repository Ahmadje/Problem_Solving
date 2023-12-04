package Calculator;
////////Calculator////////////

import java.util.Scanner;

public class runner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {

            System.out.println("\nChoose one of there operators(+, -, *, /): \n" +
                    "or Enter q to Exit\n");
            int chr = in.next().charAt(0);
            switch (chr) {
                case '+':
                    System.out.println("Enter first number: ");
                    int n1 = in.nextInt();
                    System.out.println("Enter second number: ");
                    int n2 = in.nextInt();
                    System.out.println("Result= " + (n1 + n2));
                    break;
                case '-':
                    System.out.println("Enter first number: ");
                    int n3 = in.nextInt();
                    System.out.println("Enter second number: ");
                    int n4 = in.nextInt();
                    System.out.println("Result= " + (n3 - n4));
                    break;
                case '*':
                    System.out.println("Enter first number: ");
                    int n5 = in.nextInt();
                    System.out.println("Enter second number: ");
                    int n6 = in.nextInt();
                    System.out.println("Result= " + (n5 * n6));
                    break;
                case '/':
                    System.out.println("Enter first number: ");
                    int n7 = in.nextInt();
                    System.out.println("Enter second number: ");
                    int n8 = in.nextInt();
                    System.out.println("Result= " + (n7 / n8));
                    break;
                case 'q':
                    System.out.println("See you Again :)");
                    return;
                default:
                    System.out.println("This is not option");
            }
        }
    }
}

