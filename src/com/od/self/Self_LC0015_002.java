package com.od.self;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Self_LC0015_002 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        HashSet<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (j == i + 1 || nums[j] != nums[j - 1]) {
                        for (int k = j + 1; k < nums.length; k++) {
                            if (k == j + 1 || nums[k] != nums[k - 1]) {
                                if (nums[i] + nums[j] + nums[k] == 0) {
                                    List<Integer> list = new ArrayList<Integer>();
                                    list.add(nums[i]);
                                    list.add(nums[j]);
                                    list.add(nums[k]);
                                    set.add(list);
                                }
                            }
                        }
                    }
                }
            }
        }
        ans.addAll(set);
        return ans;
    }

    public static void main(String[] args) {
        Self_LC0015_002 solution = new Self_LC0015_002();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> ret = solution.threeSum(nums);
        System.out.println(ret);
    }
}
