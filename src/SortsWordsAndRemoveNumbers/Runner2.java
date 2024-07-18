package SortsWordsAndRemoveNumbers;//////////////  Input: s = "is2 sentence4 This1 a3"
////////////// Output: "This is a sentence"
////////////// Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.

import java.util.ArrayList;
import java.util.List;

public class Runner2 {
    public static String assertArray(String sentence) {
        String[] words = sentence.split(" ");
        List<String> wordsList = new ArrayList<>(List.of(words));
        for (String word : words) {
            int index = Character.getNumericValue(word.charAt(word.length() - 1));
            wordsList.set(index - 1, word.substring(0, word.length() - 1));
        }
        return String.join(" ", wordsList);
    }

    public static void main(String[] args) {
        System.out.println(assertArray("is2 sentence4 This1 a3"));
        System.out.println(assertArray("Myself2 Me1 I4 and3"));
    }
}
