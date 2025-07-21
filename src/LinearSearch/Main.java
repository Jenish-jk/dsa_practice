package LinearSearch;

public class Main {

    public static void main(String[] args) {
        int[] num = {23 , 45 , 1, 2 , 8 , 19 , -3 , 16 , -11 , 28};
        int target = 28;
        int ans = linearSearch(num , target);
        if (ans == -1) {
            System.out.println("Target not found in the array.");
        } else {
            System.out.println("Target found at index: " + ans);
        }
    }

    static int linearSearch(int[] arr, int target){
            if(arr.length == 0){
                return -1;
            }
            for(int index = 0; index < arr.length; index++){
                int element = arr[index];
                if(element == target){
                    return index;
                }
            }
        return -1;
    }
}