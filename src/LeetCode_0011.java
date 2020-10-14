public class LeetCode_0011 {
    public int maxArea(int[] height) {
        int l = 0, r = height.length -1 ;
        int ans = 0;
        while (l < r){
            int area = Math.min(height[l],height[r]) * (r-l);
            ans = Math.max(ans,area);
            if(height[l]<height[r]){
                ++l;
            }else {
                --r;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LeetCode_0011 solution = new LeetCode_0011();
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        int ret = solution.maxArea(height);
        System.out.println(ret);
    }
}
