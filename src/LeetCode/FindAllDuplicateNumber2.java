package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicateNumber2 {
    public static void main(String[] args) {
        int [] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        FindAllDuplicateNumber2 fdn2 = new FindAllDuplicateNumber2();
        List<Integer> result = fdn2.findDuplicates(arr);
        System.out.println("Duplicate Numbers : " + result);
    }

    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] >= 1 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> answer = new ArrayList<>();
        for(int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1) {
                answer.add(nums[index]);
            }
        }
        return answer;
    }

    void swap(int [] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
