package com.od.self;

import java.util.Arrays;

public class LC0169_001 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int ret = 1;
        int n = nums.length;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        if (n == 0 || n == 1) {
            if (nums[0] == max) {
                return max;
            }
            if (nums[0] == min) {
                return min;
            }
            return ret;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            }
            if (count >= nums.length / 2) {
                ret = nums[i];
                return ret;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        LC0169_001 solution = new LC0169_001();
        //int[] nums = {3, 2, 3};
        //int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int[] nums = {Integer.MAX_VALUE};
        System.out.println(solution.majorityElement(nums));
    }
}
