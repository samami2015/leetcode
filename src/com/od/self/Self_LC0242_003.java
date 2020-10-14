package com.od.self;

public class Self_LC0242_003 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] counter = new int[26];
        for (int i = 0; i < s.length() - 1; i++) {
            counter[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < t.length() - 1; i++) {
            counter[t.charAt(i) - 'a']--;
        }
        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Self_LC0242_003 solution = new Self_LC0242_003();
        System.out.println(solution.isAnagram("anagram", "nagaram"));
    }
}
