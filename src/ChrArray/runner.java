package ChrArray;
////////Max/Min/Average of Array////////////

import java.util.Arrays;

public class runner {
    public static void main(String[] args) {
        char arr[] = {'h','e','l','l','o'};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

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

