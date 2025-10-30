package LeetCode;

public class L_1859_SortingTheSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }

    public static String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] result = new String[words.length];
        for (String word : words) {
            int position = word.charAt(word.length() - 1) - '1';
            result[position] = word.substring(0, word.length() - 1);
        }
        return String.join(" ", result);
    }
}
