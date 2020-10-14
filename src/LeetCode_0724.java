public class LeetCode_0724 {
    public int pivotIndex(int[] nums) {
        int sum=0,leftsum=0;
        for (int x:nums) sum += x;
        for (int i=0;i<nums.length;++i){
            if(leftsum==sum-leftsum-nums[i]) return i;
            leftsum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        LeetCode_0724 solution = new LeetCode_0724();
        int[] nums = new int[]{1,7,3,6,5,6};
        int ret = solution.pivotIndex(nums);
        System.out.println(ret);
    }
}
