package LeetCode;

public class L_204_CountPrimes {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(countPrimes(n));
    }

    public static int countPrimes(int n) {
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
