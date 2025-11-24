package LeetCode;

import java.util.Arrays;

public class L_153_FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Minimum Numbers : "+ findMin(nums));
    }

    public static int findMin(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        return nums[0];
    }
}
