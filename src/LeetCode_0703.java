import java.util.PriorityQueue;

public class LeetCode_0703 {
    private PriorityQueue<Integer> queue;
    private int limit;

    public LeetCode_0703(int k, int[] nums) {
        limit = k;
        queue = new PriorityQueue<>(k);
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        if (queue.size() < limit) {
            queue.add(val);
        } else if (val > queue.peek()) {
            queue.poll();
            queue.add(val);
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        int k = 3;
        int[] arr = new int[]{4, 5, 8, 2};
        LeetCode_0703 solution = new LeetCode_0703(k, arr);
        int ret1 = solution.add(3); // returns 4
        int ret2 = solution.add(5); // returns 5
        int ret3 = solution.add(10); // returns 5
        int ret4 = solution.add(9); // returns 8
        int ret5 = solution.add(4); // returns 8
        System.out.println(ret1);
        System.out.println(ret2);
        System.out.println(ret3);
        System.out.println(ret4);
        System.out.println(ret5);
    }
}
