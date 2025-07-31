package LeetCode;

import java.util.*;

public class L_2089_TargetIndicesAfterSorting {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 2 ,3};
        int target = 2;
        System.out.println(targetIndices(arr, target));
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i< nums.length; i++) {
            if (nums[i] == target) {
                list.add(i);
            }
        }

        return list;
    }
}
