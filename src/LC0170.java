import java.util.HashMap;
import java.util.Map;

public class LC0170 {
    static class TwoSum {
        Map<Integer, Integer> freq = new HashMap<>();

        /**
         * Initialize your data structure here.
         */
        public TwoSum() {

        }

        /**
         * Add the number to an internal data structure..
         */
        public void add(int number) {
            freq.put(number, freq.getOrDefault(number, 0) + 1);
        }

        /**
         * Find if there exists any pair of numbers which sum is equal to the value.
         */
        public boolean find(int value) {
            for (Integer key : freq.keySet()) {
                int other = value - key;
                if (other == key && freq.get(key) > 1) return true;
                if (other != key && freq.containsKey(other)) return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        twoSum.add(1);   // [] --> [1]
        twoSum.add(3);   // [1] --> [1,3]
        twoSum.add(5);   // [1,3] --> [1,3,5]
        twoSum.find(4);  // 1 + 3 = 4，返回 true
        twoSum.find(7);  // 没有两个整数加起来等于 7 ，返回 false

    }
}

