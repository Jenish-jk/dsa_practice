package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class L_1636_SortArrayByIncFreq {
    public static void main(String[] args) {
        int [] nums = {1, 1, 2, 2 ,2, 3};
        System.out.println(Arrays.toString(frequencySort(nums)));
    }

    public static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, (a, b) -> {
            int fa = freq.get(a);
            int fb = freq.get(b);

            if (fa != fb) return fa - fb;

            return b - a;
        });
        return Arrays.stream(arr).mapToInt(i -> i).toArray();
    }

}
