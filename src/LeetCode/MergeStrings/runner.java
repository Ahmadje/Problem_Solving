package LeetCode.MergeStrings;

////////Input text and output Array of string sorted Desc ////////////

public class runner {

    public static String longestCommonPrefix(String word1, String word2) {
        int min = Math.min(word1.length(), word2.length());
        StringBuilder result = new StringBuilder();
            for (int i = 0; i < min ; i++) {
                result.append(word1.charAt(i));
                result.append(word2.charAt(i));
            }
                if (word1.length() > word2.length())
                    result.append(word1.substring(min));
                if (word2.length() > word1.length())
                    result.append(word2.substring(min));

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix("abc","pqr"));
        System.out.println(longestCommonPrefix("abc","pqrWS"));
        System.out.println(longestCommonPrefix("abcQASR","pqrWS"));
    }
}
