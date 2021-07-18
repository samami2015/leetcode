package com.od.self;

import java.util.Stack;

public class LC0844_001 {
    public boolean backspaceCompare(String S, String T) {
        return build(S).equals(build(T));
    }

    private String build(String s) {
        Stack<Character> ans = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c != '#') {
                ans.push(c);
            } else if (!ans.empty()) {
                ans.pop();
            }
        }
        return String.valueOf(ans);
    }

    public static void main(String[] args) {
        LC0844_001 solution = new LC0844_001();
        System.out.println(solution.backspaceCompare("ab#c", "ad#c"));
    }
}
