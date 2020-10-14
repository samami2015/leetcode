package com.od.self;

import java.util.PriorityQueue;

public class Self_LC0703_001 {
    private PriorityQueue<Integer> queue;
    private int limit;

    public Self_LC0703_001(int k, int[] nums) {
        limit = k;
        queue = new PriorityQueue<Integer>(k);
        for (int num : nums) {
            add(num);
        }
    }

    private int add(int val) {
        if (queue.size() < limit) {
            queue.add(val);
        }else if(val>queue.peek()){
            queue.poll();
            queue.add(val);
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        int k = 3;
        int[] arr = new int[]{4, 5, 8, 2};
        Self_LC0703_001 solution = new Self_LC0703_001(k, arr);
        int ret1 = solution.add(3); // returns 4
        int ret2 = solution.add(5); // returns 5
        int ret3 = solution.add(10); // returns 5
        int ret4 = solution.add(9); // returns 8
        int ret5 = solution.add(4); // returns 8
        System.out.println(ret1);
        System.out.println(ret2);
        System.out.println(ret3);
        System.out.println(ret4);
        System.out.println(ret5);
    }
}
