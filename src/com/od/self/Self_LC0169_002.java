package com.od.self;

import java.util.HashMap;
import java.util.Map;

public class Self_LC0169_002 {
    private Map<Integer,Integer> countNum(int[] nums){
        Map<Integer,Integer> counts = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(!counts.containsKey(nums[i])){
                counts.put(nums[i],1);
            }else{
                counts.put(nums[i],counts.get(nums[i])+1);
            }
        }
        return counts;
    }


    public int majorityElement(int[] nums) {
        //int ret = 0;
        Map<Integer,Integer> counts = countNum(nums);
        Map.Entry<Integer,Integer> majorityEntry = null;
        for(Map.Entry<Integer,Integer> entry:counts.entrySet()){
            if(majorityEntry== null|| entry.getValue()>majorityEntry.getValue()){
                majorityEntry = entry;
            }
        }
        //return ret;
        return  majorityEntry.getKey();
    }

    public static void main(String[] args) {
        Self_LC0169_002 solution = new Self_LC0169_002();
        //int[] nums = {2,2,1,1,1,2,2};
        int[] nums = {Integer.MAX_VALUE};
        System.out.println(solution.majorityElement(nums));
    }
}
