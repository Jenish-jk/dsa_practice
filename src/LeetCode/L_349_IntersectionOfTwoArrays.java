package LeetCode;

import java.util.*;

public class L_349_IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int [] nums1 = {1, 9, 2, 1};
        int [] nums2 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int nums : nums1) {
            set1.add(nums);
        }

        Set<Integer> resultSet = new HashSet<>();
        for (int nums : nums2) {
            if (set1.contains(nums)) {
                resultSet.add(nums);
            }
        }

        int [] result = new int [resultSet.size()];
        int i = 0;

        for (int nums : resultSet) {
            result[i++] = nums;
        }

        return result;
    }
}
