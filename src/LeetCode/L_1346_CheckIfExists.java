package LeetCode;

import java.util.HashSet;

public class L_1346_CheckIfExists {
    public static void main(String[] args) {
        int [] arr = {1, 10, 5, 2};
        System.out.println(checkIfExists(arr));
    }

    public static boolean checkIfExists(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}
