package com.od.self;

public class Self_LC0050_001 {
    public double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? quickMul(x, N) : 1 / quickMul(x, -N);
    }

    public double quickMul(double x, long N) {
        if (N == 0) {
            return 1.0;
        }
        double y = quickMul(x, N / 2);
        return N % 2 == 0 ? y * y : y * y * x;
    }

    public static void main(String[] args) {
        Self_LC0050_001 solution = new Self_LC0050_001();
        System.out.println(solution.myPow(5.1,3));
    }
}
