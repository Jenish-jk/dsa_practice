package LeetCode;

import java.util.*;

public class L_438_Find_All_Anagrams_Strings {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s, p));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int window = p.length();

        for (int i = 0; i < window; i++) {
            sCount[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pCount, sCount)) result.add(0);

        for (int i = window; i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
            sCount[s.charAt(i - window) - 'a']--;

            if (Arrays.equals(sCount, pCount)) {
                result.add(i - window + 1);
            }
        }

        return result;
    }
}
