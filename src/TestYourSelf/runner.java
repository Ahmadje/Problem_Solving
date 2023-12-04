package TestYourSelf;
///////////Gives user 3 Tries to Solve expression///////////

import java.util.Scanner;
public class runner {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.println("Test your Self :)");
        System.out.println("What is '5+10/2*10' = ?");
        float userAnswer,correctAnswer=55;
        boolean status = false;
        for (int i = 1; i <= 3 ; i++) {
            userAnswer = in.nextFloat();
            if (userAnswer == correctAnswer){
                status = true;
                break;
            }else {
                if (i == 3)
                    continue;
                System.out.println("Chance #"+(i+1)+": ");
            }
        }
        if (status)
            System.out.println("correct Answer");
        else System.out.println("Wrong Answer, Try Again later");
    }
}

