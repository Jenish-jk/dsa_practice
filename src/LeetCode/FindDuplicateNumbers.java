package LeetCode;

public class FindDuplicateNumbers {
    public static void main(String[] args) {
        int [] arr = {1, 3, 4, 2, 2};
        FindDuplicateNumbers fdn = new FindDuplicateNumbers();
        int result = fdn.findDuplicate(arr);
        System.out.println("Duplicate Numbers : " +  result);
    }

    public int findDuplicate(int [] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for(int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1) {
                return nums[index];
            }
        }

        return -1;
    }

    void swap(int [] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
