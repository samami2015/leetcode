public class LC0209 {
/*    public int minSubArrayLen(int s, int[] nums) {
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i = 0;i<nums.length;i++){
            int start = i;
            int sum = 0;
            while (start < n){
                sum += nums[start];
                start++;
                if(sum>=s){
                    min = Math.min(min,start-i);
                    break;
                }
            }
        }
        return min == Integer.MAX_VALUE? 0: min;
    }*/

    public int minSubArrayLen(int s, int[] nums) {
        int n = nums.length;
        if(n==0){
            return 0;
        }
        int left = 0;
        int right = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while (right < n){
            sum += nums[right];
            right++;
            while (sum >= s){
                min = Math.min(min,right-left);
                sum -= nums[left];
                left++;
            }
        }
        return min == Integer.MAX_VALUE?0:min;
    }

    public static void main(String[] args) {
        LC0209 solution = new LC0209();
        int s = 7;
        int[] nums = {2,3,1,2,4,3};
        int ret = solution.minSubArrayLen(s,nums);
        System.out.println(ret);
    }
}
