package com.od.self;

public class LC0860_001 {
    public boolean lemonadeChange(int[] bills) {
        int sum = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                sum += bills[i];
            } else if (bills[i] % 5 ==0 && sum - bills[i] >= 0) {
                sum -= bills[i];
            }
        }
        return sum >= 0 ? true : false;
    }

    public static void main(String[] args) {
        LC0860_001 solution = new LC0860_001();
        //int[] bills = {5,5,5,10,20};
        //int[] bills = {5,5,10};
        //int[] bills = {10,10};
        int[] bills = {5,5,10,10,20};
        boolean b = solution.lemonadeChange(bills);
        System.out.println(b);
    }
}
