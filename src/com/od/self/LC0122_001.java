package com.od.self;

public class LC0122_001 {
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

    public static void main(String[] args) {
        LC0122_001 solution = new LC0122_001();
        //int[] prices = {7,1,5,3,6,4};
        //int[] prices = {1,2,3,4,5};
        int[] prices = {7,6,4,3,1};
        System.out.println(solution.maxProfit(prices));
    }
}
