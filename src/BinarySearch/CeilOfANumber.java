package BinarySearch;

public class CeilOfANumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 8;

        int ans = ceil(arr, target);
        System.out.println(ans);
    }


    //Smallest Number Greater Than Or Equal To Target

    static int ceil(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;


        if (target > arr[arr.length - 1]) {
            return -1; 
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return arr[start];
    }
}
