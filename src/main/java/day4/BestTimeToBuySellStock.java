
public class BestTimeToBuySellStock {

    static int maxProfit(int[] prices) {

        int min = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < min)
                min = prices[i];

            int currentProfit = prices[i] - min;

            if (currentProfit > profit)
                profit = currentProfit;
        }

        return profit;
    }

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println(maxProfit(prices));
    }
}