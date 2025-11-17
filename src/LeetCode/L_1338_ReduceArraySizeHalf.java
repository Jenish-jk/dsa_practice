package LeetCode;

import java.util.*;

public class L_1338_ReduceArraySizeHalf {
    public static void main(String[] args) {
        int [] arr = {3, 3, 3, 3, 5, 5, 5, 2, 2, 7};
        System.out.println(minSetSize(arr));
    }

    public static int minSetSize(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num :  arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer> freList = new ArrayList<>(freq.values());

        freList.sort(Collections.reverseOrder());

        int removed = 0;
        int count = 0;
        int half = arr.length / 2;

        for (int f : freList) {
            removed += f;
            count++;
            if (removed >= half) break;
        }

        return count;
    }
}
