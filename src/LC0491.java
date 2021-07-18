import java.util.ArrayList;
import java.util.List;

public class LC0491 {
    private List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        dfs(nums,new ArrayList<>(),0);
        return new ArrayList<>(result);
    }
    private void dfs(int[] nums,List<Integer> list,int index){
        if(index>=nums.length){
            if(list.size()>=2){
                result.add(new ArrayList<>(list));
            }
            return;
        }
        if(list.isEmpty()||nums[index]>=list.get(list.size()-1)){
            list.add(nums[index]);
            dfs(nums,list,index+1);
            list.remove(list.size()-1);
        }
        if(index>0&&!list.isEmpty()&&nums[index]==list.get(list.size()-1)){
            return;
        }
        dfs(nums,list,index+1);
    }

    public static void main(String[] args) {
        LC0491 solution = new LC0491();
        int[] nums = new int[]{4,6,7,7};
        List<List<Integer>> ret = solution.findSubsequences(nums);
        System.out.println(ret);
    }
}
