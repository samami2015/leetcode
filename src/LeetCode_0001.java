import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode_0001 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No tow sum slution");
    }

    public static void main(String[] args) {
        LeetCode_0001 solution = new LeetCode_0001();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] ret = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(ret));
    }
}
