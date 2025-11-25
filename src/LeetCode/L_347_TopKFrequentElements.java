package LeetCode;

import java.util.*;

public class L_347_TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 1, 2, 3, 1, 3, 2};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(freq.keySet());
        list.sort((a, b) -> freq.get(b) - freq.get(a));

        int[] result = new int[k];
        for (int i = 0; i < k; i++) result[i] = list.get(i);
        return result;
    }

}
