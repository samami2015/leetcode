public class LC0122 {
    public int maxProfit(int[] prices) {
        return calculate(prices, 0);
    }

    private int calculate(int[] prices, int s) {
        if (s >= prices.length) {
            return 0;
        }
        int max = 0;
        for (int start = s; start < prices.length; start++) {
            int maxprofit = 0;
            for (int i = start + 1; i < prices.length; i++) {
                if (prices[start] < prices[i]) {
                    int profit = calculate(prices, i + 1) + prices[i] - prices[start];
                    if (profit > maxprofit) {
                        maxprofit = profit;
                    }
                }
            }
            if (max < maxprofit) {
                max = maxprofit;
            }
        }
        return max;
    }

/*    public int maxProfit(int[] prices) {
        int i = 0;
        int valley = prices[0];
        int peak = prices[0];
        int maxprofit = 0;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1]) {
                i++;
            }
            valley = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1]) {
                i++;
            }
            peak = prices[i];
            maxprofit += peak - valley;
        }

        return maxprofit;
    }*/

/*    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                maxprofit += prices[i] - prices[i-1];
            }
        }
        return maxprofit;
    }*/

    public static void main(String[] args) {
        LC0122 solution = new LC0122();
        //int[] prices = {7,1,5,3,6,4};
        //int[] prices = {1,2,3,4,5};
        int[] prices = {7,6,4,3,1};
        System.out.println(solution.maxProfit(prices));
    }
}
