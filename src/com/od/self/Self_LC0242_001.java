package com.od.self;

import java.util.Arrays;

public class Self_LC0242_001 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }

    public static void main(String[] args) {
        Self_LC0242_001 solution = new Self_LC0242_001();
        System.out.println(solution.isAnagram("anagram","nagaram"));
    }
}
