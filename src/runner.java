import java.util.*;
import java.util.stream.Collectors;

////////Input text and output Array of string sorted Desc ////////////

public class runner {

    public static String longestCommonPrefix(String[] input) {
        List<String> wordsArr = new ArrayList<>(Arrays.asList(input));
        String sub = wordsArr.get(0);
        for (String w : wordsArr)
            while (w.indexOf(sub) != 0) {
                sub = sub.substring(0, sub.length() - 1);
            }
        return sub;
    }




    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }
}
