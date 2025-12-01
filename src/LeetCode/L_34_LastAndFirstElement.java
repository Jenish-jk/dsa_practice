package LeetCode;

import java.util.Arrays;

public class L_34_LastAndFirstElement {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }

    private static int findFirst(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target <= nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            if (nums[mid] == target)
                ans = mid;
        }

        return ans;
    }

    private static int findLast(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target >= nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

            if (nums[mid] == target)
                ans = mid;
        }

        return ans;
    }

}
