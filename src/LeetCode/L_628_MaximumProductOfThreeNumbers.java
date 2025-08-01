package LeetCode;

import java.util.Arrays;

public class L_628_MaximumProductOfThreeNumbers {
    public static void main(String[] args) {
        int[] arr = {-1,-2,-3};
        int[] arr1 = {1, 2, 3, 4, 5, 6,};
        System.out.println(maximumProduct(arr1));
    }

    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int product1 = nums[n -1] * nums[n - 2] * nums[n - 3];
        int product2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(product1, product2);
    }
}
