package LeetCode;

import java.util.Arrays;

public class FindRelativeRanks {
    public static void main(String[] args) {
        int [] score = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(findRelativeRanks(score)));
    }

    public static String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];

        int[][] indexedScores = new int[n][2];
        for (int i = 0; i < n; i++) {
            indexedScores[i][0] = score[i];
            indexedScores[i][1] = i;
        }

        Arrays.sort(indexedScores, (a, b) -> b[0] - a[0]);

        for (int i = 0; i < n; i++) {
            int index = indexedScores[i][1];
            if (i == 0) result[index] = "Gold Medal";
            else if (i == 1) result[index] = "Silver Medal";
            else if (i == 2) result[index] = "Bronze Medal";
            else result[index] = String.valueOf(i + 1);
        }

        return result;
    }
}
