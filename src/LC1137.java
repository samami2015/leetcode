public class LC1137 {
    static class Tri {
        private int n = 38;
        public int[] nums = new int[n];

        Tri() {
            nums[1] = 1;
            nums[2] = 1;
            helper(n - 1);
        }

        int helper(int k) {
            if (k == 0) return 0;
            if (nums[k] != 0) return nums[k];

            nums[k] = helper(k - 1) + helper(k - 2) + helper(k - 3);
            return nums[k];
        }
    }
    //输入：n = 25
    //输出：1389537
    public static void main(String[] args) {
        LC1137 solution = new LC1137();
        int n = 25;
        for (int i = 1; i <= n; ++i) {
            int ans = solution.tribonacci(i);
            System.out.println("n = " + i + ", ans = " + ans);
        }
    }
/*    public int tribonacci(int n) {
        if (n < 3) return n == 0 ? 0 : 1;
        int tmp = 0, x = 0, y = 1, z = 1;
        for (int i = 3; i <= n; ++i) {
            tmp = x + y + z;
            x = y ;
            y = z ;
            z = tmp;
        }
        return z;
    }*/

    /*    public int tribonacci(int n) {
            if (n < 2) return n;
            int a = 0, b = 1, c = 1, d = 0;
            while (n-- > 2) {
                d = a + b + c;
                a = b ;
                b = c ;
                c = d ;
            }
            return c;
        }*/

    public static Tri t = new Tri();

    public int tribonacci(int n) {
        return t.nums[n];
    }
}

/*class Tri {
    private int n = 38;
    public int[] nums = new int[n];

    Tri() {
        nums[1] = 1;
        nums[2] = 1;
        for (int i = 3; i < n; ++i) {
            nums[i] = nums[i - 1] + nums[i - 2] + nums[i - 3];
        }
    }
}*/

