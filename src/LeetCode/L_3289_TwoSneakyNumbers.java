package LeetCode;

import java.util.Arrays;

public class L_3289_TwoSneakyNumbers {
    public static void main(String[] args) {
        int[] nums = {7,1,5,4,3,4,6,0,9,5,8,2};
        System.out.println(Arrays.toString(getSneakyNumbers(nums)));
    }

    public static int[] getSneakyNumbers(int[] nums) {
        final int MAX = 100;
        int[] result = new int[2];
        int[] count = new int[MAX + 1];
        int idx = 0;

        for (int x : nums) {
            count[x]++;
            if (count[x] == 2) {
                result[idx++] = x;
                if (idx == 2) {
                    break;
                }
            }
        }
        return result;
    }
}
