package com.od.self;

import java.util.Arrays;

public class Self_LC0455_001 {
    public int findContentChildren(int[] grid, int[] size) {
        if (grid == null || size == null) return 0;
        Arrays.sort(grid);
        Arrays.sort(size);
        int gi = 0, si = 0;
        while (gi < grid.length && si < size.length) {
            if(grid[gi]<=size[si]){
                gi++;
            }
            si++;
        }
        return gi;
    }

    public static void main(String[] args) {
        Self_LC0455_001 solution = new Self_LC0455_001();
        int[] grid = {1,2,3};
        int[] size = {1,1};
        int contentChildren = solution.findContentChildren(grid, size);
        System.out.println(contentChildren);
    }
}
