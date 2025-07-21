package BinarySearch;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int [] arr = {7, 2, 5, 8, 10};
        int k = 2;
        System.out.println(splitArray(arr, k));
    }

    public static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int j : nums) {
            start = Math.max(start, j);
            end += j;
        }

        while (start < end) {
            int mid = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;

            for(int num : nums) {
                if(sum + num > mid) {
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > k){
                start = mid + 1;
            } else {
                end = mid;
            }

        }

        return end;
    }
}
