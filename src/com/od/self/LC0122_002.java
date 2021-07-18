package com.od.self;

public class LC0122_002 {
    public int maxProfit(int[] prices) {
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
    }
    public static void main(String[] args) {
        LC0122_002 solution = new LC0122_002();
        //int[] prices = {7,1,5,3,6,4};
        //int[] prices = {1,2,3,4,5};
        int[] prices = {7,6,4,3,1};
        System.out.println(solution.maxProfit(prices));
    }
}
