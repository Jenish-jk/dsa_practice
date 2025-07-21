package LeetCode;

import java.util.Arrays;

public class FindMissingPositive {
    public static void main(String[] args) {
        int [] arr = {3, 4, -1, 1};
        FindMissingPositive fmp = new FindMissingPositive();
        int [] result = new int[]{fmp.firstMissingPositive(arr)};
        System.out.println("Missing Positive Number : " + Arrays.toString(result));
    }

    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            }else {
                i++;
            }
        }
        for(int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1) {
                return index + 1;
            }
        }
        return nums.length + 1;
    }

    void swap(int [] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
