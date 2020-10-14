package com.od.self;

import java.util.ArrayList;
import java.util.List;

public class Self_LC0022_003 {
    ArrayList[] cache = new ArrayList[100];

    public List<String> generateParenthesis(int n) {
        return generate(n);
    }

    private List<String> generate(int n) {
        if (cache[n] != null) {
            return cache[n];
        }
        ArrayList<String> ans = new ArrayList<>();
        if (n == 0) {
            ans.add("");
        } else {
            for (int c = 0; c < n; c++) {
                for (String left : generate(c)) {
                    for (String right : generate(n - 1 - c)) {
                        ans.add("(" + left + ")" + right);
                    }
                }
            }
        }
        cache[n] = ans;
        return ans;
    }
}
