import java.util.List;

public class LC0385 {
    class NestedInteger {
        private int value;

        // Constructor initializes an empty nested list.
        public NestedInteger() {
        }

        // Constructor initializes a single integer.
        public NestedInteger(int value) {
            setInteger(value);
        }

        // @return true if this NestedInteger holds a single integer, rather than a nested list.
        public boolean isInteger() {
            return true;
        }

        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        public Integer getInteger() {
            return 0;
        }

        // Set this NestedInteger to hold a single integer.
        public void setInteger(int value) {

        }

        // Set this NestedInteger to hold a nested list and adds a nested integer to it.
        public void add(NestedInteger ni) {
        }

        // @return the nested list that this NestedInteger holds, if it holds a nested list
        // Return empty list if this NestedInteger holds a single integer
        public List<NestedInteger> getList() {
            return null;
        }
    }

    public static void main(String[] args) {
        LC0385 solution = new LC0385();
        String s = "324";
        NestedInteger ans = solution.deserialize(s);
        System.out.println(ans.getInteger());
    }

    //递归函数通过字符数组和cur下标确定要处理的位置
    char[] chars;
    int cur = 0;

    public NestedInteger deserialize(String s) {
        chars = s.toCharArray();
        //本身不是一个集合而是一个整数的情况
        if (chars[0] != '[') return new NestedInteger(Integer.valueOf(s));
        //调用递归函数返回根集合
        return getNest();
    }

    private NestedInteger getNest() {
        NestedInteger nest = new NestedInteger();
        int num = 0;//num用于缓存用逗号分割的整数类型的值
        boolean negative = false;//当前记录的整数是不是负数
        while (cur != chars.length - 1) {
            cur++;
            if (chars[cur] == ',') continue;
            if (chars[cur] == '[') nest.add(getNest());//遇到[递归获取子集合
            else if (chars[cur] == ']') return nest;
            else if (chars[cur] == '-') negative = true;
            else {//是数字的情况
                if (negative) num = 10 * num - (chars[cur] - 48);
                else num = 10 * num + (chars[cur] - 48);
                //如果下一个字符是,或者]说明当前数字已经记录完了，需要加入集合中
                if (chars[cur + 1] == ',' || chars[cur + 1] == ']') {
                    nest.add(new NestedInteger(num));
                    num = 0;
                    negative = false;
                }
            }
        }
        return null;
    }
}
