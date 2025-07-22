package LeetCode;


public class MaximumErasureValue {
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 2, 5, 2, 1, 2, 5};
        System.out.println(maximumUniqueSubarray(arr));
    }

    public static int maximumUniqueSubarray(int[] nums) {
        int maxVal = 0;
        for (int num : nums) {
            maxVal = Math.max(maxVal, num);
        }

        boolean[] seen = new boolean[maxVal + 1];
        int left = 0, right = 0;
        int sum = 0, maxSum = 0;

        while (right < nums.length) {
            if (!seen[nums[right]]) {
                seen[nums[right]] = true;
                sum += nums[right];
                maxSum = Math.max(maxSum, sum);
                right++;
            } else {
                seen[nums[left]] = false;
                sum -= nums[left];
                left++;
            }
        }

        return maxSum;
    }
}
