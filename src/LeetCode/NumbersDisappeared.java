package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class NumbersDisappeared {
    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
        NumbersDisappeared nd = new NumbersDisappeared();
        List<Integer> result = nd.findDisappearedNumbers(arr);
        System.out.println("Disappeared Number : " + result);
    }

    public List<Integer> findDisappearedNumbers(int [] nums) {
            int i = 0;
            while(i < nums.length) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i , correct);
                } else {
                    i++;
                }
            }

            List<Integer> answer = new ArrayList<>();
            for (int index = 0; index < nums.length ; index++) {
                if(nums[index] !=  index + 1) {
                    answer.add(index + 1);
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
