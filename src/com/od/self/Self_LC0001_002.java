package com.od.self;

public class Self_LC0001_002 {
    public int[] twoSum(int[] nums, int target) {
        //Arrays.sort(nums);
        int [] ret = new int[2];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    ret[0]=i;
                    ret[1]=j;
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Self_LC0001_002 solution = new Self_LC0001_002();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ret = solution.twoSum(nums, target);
        for (int i = 0; i < ret.length; i++) {
            System.out.println(ret[i]);
        }
    }
}
