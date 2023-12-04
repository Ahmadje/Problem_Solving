package Max_MinOfArrayList;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

////////Max/Min/Average of ArrayList ////////////

public class runner {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(5, 7, 11, -1, 6, 80, 1));
        System.out.println("Max value is " + Collections.max(arr));
//        System.out.println("Max value is " + Arrays.stream(arr.toArray()).mapToInt(ele -> (int) ele).min().getAsInt());
        System.out.println("Min value is " + Collections.min(arr));
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Avg value is " + Double.parseDouble(df.format(Arrays.stream(arr.toArray()).mapToInt(ele -> (int) ele).average().getAsDouble())));
        Collections.sort(arr);
        System.out.println("Sorted Array in Asc= " + arr);
//        Collections.sort(arr,Collections.reverseOrder());
        Collections.reverse(arr);
        System.out.print("Sorted Array in Desc: "+ arr);
    }
}

