package BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int [] arr = {90,85,76,54,43,22,11,5,2,1};
        int target = 76;
        System.out.println(orderAgnosticBS(arr , target));
    }

    static int orderAgnosticBS(int[] arr , int target){

        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start) / 2;
            System.out.println("starting index : " + start + ", ending index : " + end + ", mid index : " + mid + ", middle element (arr[mid]) : " + arr[mid]);

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target < arr[mid]){
                    start = mid + 1;
                } else {
                     end = mid - 1;
                }
            }
        }
        return -1;
    }
}
