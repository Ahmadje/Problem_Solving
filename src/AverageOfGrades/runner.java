package AverageOfGrades;
////////////// Get Sum of Grades and break when user enter -1 ///////////////

import java.util.Scanner;

public class runner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float grade = 0;
        float sum = 0;
        int count =0;

        while (grade != (-1)){
            System.out.println("Enter Grade #"+ (count+1) +":");
            grade = in.nextFloat();
            if (grade != (-1)){
                count++;
                sum+=grade;
            }
        }
        System.out.println("Average = "+(sum/count));
    }
}

