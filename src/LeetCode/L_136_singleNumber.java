package LeetCode;


public class L_136_singleNumber {
    public static void main(String[] args) {
        int [] nums = {2, 2, 1};
        int result = singleNumber(nums);
        System.out.println(result);
    }

    public static int singleNumber(int[] nums){
        int ans = 0;
        for (int num : nums) {
            ans ^= num;
        }
        return ans;
    }
}
