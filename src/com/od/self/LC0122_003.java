package com.od.self;

public class LC0122_003 {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                maxprofit += prices[i] - prices[i-1];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        LC0122_003 solution = new LC0122_003();
        //int[] prices = {7,1,5,3,6,4};
        int[] prices = {1,2,3,4,5};
        //int[] prices = {7,6,4,3,1};
        System.out.println(solution.maxProfit(prices));
    }
}
