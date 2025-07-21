package LeetCode;

public class MissingNumber {
    public static void main(String[] args) {
        int [] arr = {3, 1, 0, 5};
        MissingNumber mn = new MissingNumber();
        int result = mn.missingNumber(arr);
        System.out.println("Missing Number : " + result);
     }

    public int missingNumber(int [] arr) {
        int i = 0;
        while (i < arr.length){
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++){
            if(arr[index] != index) {
                return index;
            }
        }

        return arr.length;
    }

    public void swap(int [] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
