import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode_0169 {
/*    private Map<Integer,Integer> countNum(int[] nums){
        Map<Integer,Integer> counts = new HashMap<Integer,Integer>();
        for(int num:nums){
            if(!counts.containsKey(num)){
                counts.put(num,1);
            }else{
                counts.put(num,counts.get(num)+1);
            }
        }
        return counts;
    }

    public int majorityElement(int[] nums) {
        Map<Integer,Integer> counts = countNum(nums);
        Map.Entry<Integer,Integer> majorityEntry = null;
        for(Map.Entry<Integer,Integer> entry:counts.entrySet()){
            if(majorityEntry==null||entry.getValue()>majorityEntry.getValue()){
                majorityEntry = entry;
            }
        }
        return majorityEntry.getKey();
    }*/
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public static void main(String[] args) {
        LeetCode_0169 solution = new LeetCode_0169();
        int[] nums = new int[]{3,2,3};
        int ret = solution.majorityElement(nums);
        System.out.println(ret);
    }
}
