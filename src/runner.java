import java.util.*;
import java.util.stream.Collectors;

////////Input text and output Array of string sorted Desc ////////////

public class runner {

    public static List<String> assertArray(String sentence1, String sentence2) {
        String[] words1 = sentence1.split(" ");
        String[] words2 = sentence2.split(" ");
        List<String> result = new ArrayList<>();
        for (String word : words1) {
            if (!Arrays.asList(words2).contains(word))
                result.add(word);
        }
        for (String word : words2) {
            if (!Arrays.asList(words1).contains(word))
                result.add(word);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(assertArray("this apple is sweet","this apple is sour"));
    }
}
