package LeetCode;

import java.util.Arrays;

public class L_1051_HeightChecker {
    public static void main(String[] args) {
        int[] arr = {1, 1, 4, 2, 1, 3};
        System.out.println(heightChecker(arr));
    }

    public static int heightChecker(int[] heights){

        int[] expected = heights.clone();
        Arrays.sort(expected);

        int count = 0;

        for(int i = 0; i < heights.length; i++) {
            if(heights[i] != expected[i]) {
                count ++;
            }
        }

        return count;
    }
}
