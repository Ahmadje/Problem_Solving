package commonBetween2Arrays;
////////////// Get Sum of Grades and break when user enter -1 ///////////////

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class runner2 {
    public static void main(String[] args) {
        List<Integer> arr1 = Arrays.asList(5, 6, 2, 3, 7, 9, 0);
        List<Integer> arr2 = Arrays.asList(8, 11, 23, 3, 7, 19, 20, 30);
        List<Integer> resultArray = new ArrayList<>();

        //Different Elements
        System.out.println(arr1.stream().filter(ele -> !arr2.contains(ele)).collect(Collectors.toList()));
        //Common Elements with Method Reference
        System.out.println(arr1.stream().filter(arr2 :: contains).collect(Collectors.toList()));


    }
}

