package ListOfDistinctElements;
////////Create a List of Distinct Elements Taken by user , and print these elements ////////////

import java.util.*;

public class runner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter Size of List: ");
        int size = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(size);
        for (int i = 0; i < size;) {
            System.out.println("Enter #" + (i + 1) + ": ");
            int num = in.nextInt();
            if (!arr.contains(num)){
                arr.add(num);
                i++;
            }
            else System.out.println("Duplicated number! Enter another Number");
        }

        System.out.println(arr);

    }
}

