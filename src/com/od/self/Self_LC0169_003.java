package com.od.self;

import java.util.Arrays;

public class Self_LC0169_003 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public static void main(String[] args) {
        Self_LC0169_003 solution = new Self_LC0169_003();
        int[] nums = {2,2,1,1,1,2,2};
        //int[] nums = {Integer.MAX_VALUE};
        System.out.println(solution.majorityElement(nums));
    }
}
