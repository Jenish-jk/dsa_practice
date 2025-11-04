package LeetCode;

import java.util.Arrays;

public class L_58_LengthOfLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        String[] words = s.trim().split("\\s+");
        System.out.println(Arrays.toString(words));
        return words[words.length-1].length();
    }
}
