package com.od.self;

public class LC0050_002 {
    public double quickMul(double x, long N) {
        double ans = 1.0;
        double x_contribution = x;
        while (N > 0) {
            if (N % 2 == 1) {
                ans *= x_contribution;
            }
            x_contribution *= x_contribution;
            N /= 2;
        }
        return ans;
    }

    public double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? quickMul(x, N ) : 1.0 / quickMul(x, -N);
    }

    public static void main(String[] args) {
        LC0050_002 solution = new LC0050_002();
        System.out.println(solution.myPow(5.1,3));
    }
}
