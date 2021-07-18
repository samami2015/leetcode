package com.od.self;

import java.util.*;

public class LC0015_001 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        HashSet<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        //System.out.println("nums[i]="+nums[i]+",nums[j]="+nums[j]+",nums[k]="+nums[k]);
                        List<Integer> list = new ArrayList<Integer>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        //ans.add(list);
                        set.add(list);
                    }
                }
            }
        }
        ans.addAll(set);
        return ans;
    }

    public static void main(String[] args) {
        LC0015_001 solution = new LC0015_001();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        //Arrays.sort(nums);
        List<List<Integer>> ret = solution.threeSum(nums);
        System.out.println(ret);
    }
}

