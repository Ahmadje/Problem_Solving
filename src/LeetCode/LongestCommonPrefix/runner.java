package LeetCode.LongestCommonPrefix;

////////Input text and output Array of string sorted Desc ////////////

public class runner {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (String word : strs)
            while (word.indexOf(prefix) != 0)
                prefix = prefix.substring(0, prefix.length() - 1);
        return prefix;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"", "b"}));
    }
}
