package com.od.self;

import java.util.Random;

public class LC0169_004 {
    private int randRange(Random rand, int max, int min) {
        return rand.nextInt(max - min) + min;
    }

    private int countOccurence(int[] nums, int num) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }

    public int majorityElement(int[] nums) {
        Random rand = new Random();
        int majorityCount = nums.length / 2;
        while (true) {
            int candidate = nums[randRange(rand, 0, nums.length)];
            if (countOccurence(nums, candidate) > majorityCount) {
                return candidate;
            }
        }
    }
}
