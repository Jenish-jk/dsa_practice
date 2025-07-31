package LeetCode;

public class L_1491_AverageSalaryMinMax {
    public static void main(String[] args) {
        int[] arr = {4000, 3000, 1000, 2000};
        System.out.println(average(arr));
    }

    public static double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int sal : salary) {
            sum += sal;
            min = Math.min(min, sal);
            max = Math.max(max, sal);
        }

        sum = sum - min - max;
        return (double) sum / (salary.length - 2);
    }
}
