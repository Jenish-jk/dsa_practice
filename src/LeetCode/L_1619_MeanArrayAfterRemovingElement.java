package LeetCode;


import java.util.Arrays;

public class L_1619_MeanArrayAfterRemovingElement {
    public static void main(String[] args) {
        int[] arr = {6,0,7,0,7,5,7,8,3,4,0,7,8,1,6,8,1,1,2,4,8,1,9,5,4,3,8,5,10,8,6,6,1,0,6,10,8,2,3,4};
        System.out.println(trimMean(arr));
    }

    public static double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int trim = n / 20;
        int sum = 0;

        for (int i = trim; i < n -trim; i++) {
            sum += arr[i];
        }

        return (double) sum / (n - 2 * trim);
    }
}
