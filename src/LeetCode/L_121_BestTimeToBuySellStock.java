package LeetCode;

public class L_121_BestTimeToBuySellStock {
    public static void main(String[] args) {
        int [] nums = {3, 1, 4, 7, 8, 0};
        System.out.println(maxProfit(nums));
    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }

            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }
}
