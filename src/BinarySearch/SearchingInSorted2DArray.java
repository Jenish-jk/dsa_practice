package BinarySearch;

import java.util.Arrays;

public class SearchingInSorted2DArray {
    public static void main(String[] args) {
         int[][] arr= {
                 {1, 2, 3, 4},
                 {5, 6, 7, 8},
                 {9, 10, 11, 12},
                 {13, 14, 15, 16}
         };

         int target = 16;

        System.out.println(Arrays.toString(search(arr, target)));

    }

    static int [] binarySearch(int [][] matrix, int  row, int colStart, int colEnd, int target) {
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;

            if (matrix[row][mid] == target) {
                return new int[] {row, mid};
            }

            if (matrix[row][mid] < target) {
                colStart = mid + 1;
            } else {
                colEnd = mid - 1;
            }

        }
        return new int [] {-1, -1};
    }

    static int[] search(int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0].length;

        int rowStart = 0;
        int rowEnd = rows -1;
        int colMid = cols / 2;

        if (rows == 1) {
            return binarySearch(arr, 0, 0, cols-1, target);
        }

        while (rowStart < (rowEnd - 1)) {
            int mid = rowStart + (rowEnd - rowStart) / 2;

            if (arr[mid][colMid] == target) {
                return new int[] {mid, colMid};
            }

            if (arr[mid][colMid] < target) {
                rowStart = mid;
            } else {
                rowEnd = mid;
            }
        }

        if (arr[rowStart][colMid] == target) {
            return  new int[] {rowStart, colMid};
        }

        if (arr[rowStart +1][colMid] == target) {
            return  new int[] {rowStart + 1, colMid};
        }

        if (target <= arr[rowStart][colMid -1]) {
            return binarySearch(arr, rowStart, 0, colMid-1, target);
        }

        if (target >= arr[rowStart][colMid + 1] && target <= arr[rowStart][cols -1]) {
            return binarySearch(arr, rowStart, colMid + 1, cols -1, target);
        }

        if (target <= arr[rowStart +1][colMid - 1]) {
            return binarySearch(arr, rowStart +1, 0, colMid - 1, target);
        } else {
            return binarySearch(arr, rowStart + 1, colMid + 1, cols - 1, target);
        }
    }
}
