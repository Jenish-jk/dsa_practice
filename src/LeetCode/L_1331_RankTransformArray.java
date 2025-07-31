package LeetCode;

import java.util.*;

public class L_1331_RankTransformArray {
    public static void main(String[] args) {
        int[] arr = {37, 12, 28, 9, 100, 56, 80, 5, 12};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }

    public static int [] arrayRankTransform(int[] arr) {
        int[] correct = arr.clone();
        Arrays.sort(correct);

        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int num : correct) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }

        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = rankMap.get(arr[i]);
        }

        return result;
    }
}
