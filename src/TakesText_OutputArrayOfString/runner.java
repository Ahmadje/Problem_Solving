package TakesText_OutputArrayOfString;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

////////Input text and output Array of string sorted Desc ////////////

public class runner {

    public static void main(String[] args) {
        String Txt = "Ahmed Yousef Ibrahim";
        List<String> result = Arrays.asList(Txt.split(" "));
        Collections.sort(result, Collections.reverseOrder());
        System.out.println(result);
    }
}

