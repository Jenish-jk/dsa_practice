package BinarySearch;

public class FindInMountainArray {

    public static void main(String[] args) {
        int[] mountainArr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        System.out.println(findInMountainArray(mountainArr, target));
    }

    static int findInMountainArray(int[] arr, int target) {
        int peak = findPeakIndex(arr);
        int firstTry = binarySearch(arr, target, 0, peak, true);
        if (firstTry != -1) return firstTry;

        return binarySearch(arr, target, peak + 1, arr.length - 1, false);
    }

    static int findPeakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int binarySearch(int[] arr, int target, int start, int end, boolean ascending) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (ascending) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
