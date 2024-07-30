package LeetCode.SortThePeople;

import java.util.TreeMap;

////////Input text and output Array of string sorted Desc ////////////

public class runner {

    public static String sortPeople(String[] names, int[] height) {
        TreeMap<Integer, String> combinedMap = new TreeMap<>();
        for (int i = 0; i < names.length; i++) {
            combinedMap.put(height[i], names[i]);
        }
        return combinedMap.reversed().values().toString();
    }


    public static void main(String[] args) {
        System.out.println(sortPeople(new String[]{"Mary", "John", "Emma"}, new int[]{180, 165, 170}));
        System.out.println(sortPeople(new String[]{"Alice","Bob","Bob"}, new int[]{155,185,150}));
    }
}
