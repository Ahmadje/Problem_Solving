package LeetCode.JewelsAndStones;

import java.util.HashMap;

public class Runner {
    public static int fixSentence(String stones, String jewesls) {
        char[] stronesArr = stones.toCharArray();
        char[] jewelsArr = jewesls.toCharArray();
        HashMap<Character,Integer> charCounts = new HashMap<>();
        int count = 0;
        for ( char c : stronesArr)
            charCounts.put(c,charCounts.getOrDefault(c,0)+1);

        for ( char c : jewelsArr)
            count = count + charCounts.getOrDefault(c,0);
        return count;
    }

    public static void main(String[] args) {
        System.out.println(fixSentence("aAAbbbb","aA"));
    }
}
