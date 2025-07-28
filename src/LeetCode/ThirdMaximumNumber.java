package LeetCode;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        System.out.println(thirdMax(arr));
    }

    public static int thirdMax(int[] nums) {
        Long max1 = null, max2 = null, max3 = null;

        for (int num : nums) {
            long n = (long) num;

            if ((max1 != null && n == max1) ||
                    (max2 != null && n == max2) ||
                    (max3 != null && n == max3)) {
                continue;
            }

            if (max1 == null || n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (max2 == null || n > max2) {
                max3 = max2;
                max2 = n;
            } else if (max3 == null || n > max3) {
                max3 = n;
            }
        }

        if ((max3 == null)) {
            assert max1 != null;
            return max1.intValue();
        } else {
            return max3.intValue();
        }
    }
}


