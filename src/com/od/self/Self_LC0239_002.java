package com.od.self;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Self_LC0239_002 {
    ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
    int[] nums;

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n * k == 0) return new int[0];
        if (k == 1) return nums;

        this.nums = nums;
        int max_idx = 0;
        for (int i = 0; i < k; i++) {
            clean_deque(i, k);
            deque.addLast(i);
            if (nums[i] > nums[max_idx]) max_idx = 1;
        }
        int[] output = new int[n - k + 1];
        output[0] = nums[max_idx];

        for (int i = k; i < n; i++) {
            clean_deque(i, k);
            deque.addLast(i);
            output[i - k + 1] = nums[deque.getFirst()];
        }
        return output;
    }

    private void clean_deque(int i, int k) {
        if (!deque.isEmpty() && deque.getFirst() == i - k) {
            deque.removeFirst();
        }
        while (!deque.isEmpty() && nums[i] > nums[deque.getLast()]) {
            deque.removeLast();
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        Self_LC0239_002 solution = new Self_LC0239_002();
        int[] ret = solution.maxSlidingWindow(nums, k);

        System.out.println(Arrays.toString(ret));
    }
}
