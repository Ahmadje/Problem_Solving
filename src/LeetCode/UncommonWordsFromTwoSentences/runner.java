package LeetCode.UncommonWordsFromTwoSentences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

////////Input text and output Array of string sorted Desc ////////////

public class runner {

    public static List<String> removeUncommon(String sentence1, String sentence2) {
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
        System.out.println(removeUncommon("this apple is sweet","this apple is sour"));
    }
}
