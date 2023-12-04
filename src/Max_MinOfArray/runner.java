package Max_MinOfArray;
////////Max/Min/Average of Array////////////

import java.util.*;

public class runner {
    public static void main(String[] args) {
        int arr[] = {5, 7, 11, -1, 6, 80, 1};
        System.out.println("Max value is " + Arrays.stream(arr).max().getAsInt());
        System.out.println("Min value is " + Arrays.stream(arr).min().getAsInt());
        System.out.println("Avg value is " + Arrays.stream(arr).average().getAsDouble());
        Arrays.sort(arr);
        System.out.println("Sorted Array in Asc= " + Arrays.toString(arr));
        System.out.print("Sorted Array in Desc: ");
        for (int i = arr.length-1 ; i >= 0; i--) {
            System.out.print(arr[i] + "  ");
        }


        /**
         Difference between 2 types of For With printing Arrays
         */

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        for(int i : arr){
//            System.out.print(i+" ");
//        }

        /**
         Another Solution
         */
//        int arr[] = {5, 7, 11, -1, 6, 80, 1};
//        int max_value = arr[0];
//        int min_value = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] < min_value)
//                min_value = arr[i];
//            if (arr[i] > max_value)
//                max_value = arr[i];
//        }
//        System.out.println("Max value = " + max_value);
//        System.out.println("Min value = " + min_value);
    }
}

