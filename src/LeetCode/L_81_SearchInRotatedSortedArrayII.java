package LeetCode;

public class L_81_SearchInRotatedSortedArrayII {
    public static void main(String[] args) {
        int [] nums = {2,5,6,0,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));
    }

    public static boolean search(int [] nums, int target) {
        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }

        return false;
    }
}
