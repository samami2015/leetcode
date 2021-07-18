package com.od.self;

import java.util.HashMap;
import java.util.Map;

public class LC0001_004 {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int compement = target - nums[i];
            if (map.containsKey(compement) && map.get(compement) != i) {
                return new int[]{i, map.get(compement)};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        LC0001_004 solution = new LC0001_004();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ret = solution.twoSum(nums, target);
        for (int i = 0; i < ret.length; i++) {
            System.out.println(ret[i]);
        }
    }
}
