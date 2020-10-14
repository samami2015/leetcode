import java.util.Arrays;

public class LeetCode_0283 {
    public void moveZeroes(int[] nums) {
        if(nums == null){
            return;
        }
        int j = 0;
        for (int i=0;i<nums.length;++i){
            if(nums[i]!=0){
                nums[j++]=nums[i];
            }
        }
        for (int i=j;i<nums.length;++i){
            nums[i]=0;
        }
    }

    public static void main(String[] args) {
        LeetCode_0283 solution = new LeetCode_0283();
        int[] nums = new int[]{0,1,0,3,12};
        solution.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
