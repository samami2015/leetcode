import java.util.Stack;

class LeetCode_0232 {
    /**
     * Initialize your data structure here.
     */
    public LeetCode_0232() {
    }

    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();
    /**
     * Push element x to the back of queue.
     */
    private int front;

    public void push(int x) {
        if (s1.empty())
            front = x;
        while (!s1.isEmpty())
            s2.push(s1.pop());
        s2.push(x);
        while (!s2.isEmpty())
            s1.push(s2.pop());
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
// Removes the element from the front of queue.
    public int pop() {
        int ret = s1.pop();
        if (!s1.empty())
            front = s1.peek();
        return ret;
    }

    /**
     * Get the front element.
     */
// Get the front element.
    public int peek() {
        return front;
    }

    /**
     * Returns whether the queue is empty.
     */
// Return whether the queue is empty.
    public boolean empty() {
        return s1.isEmpty();
    }

    public static void main(String[] args) {
        LeetCode_0232 obj = new LeetCode_0232();
        obj.push(1);
        obj.push(2);
        int ret = obj.peek();
        System.out.println(ret);
        ret = obj.pop();
        System.out.println(ret);
        boolean bret = obj.empty();
        System.out.println(bret);
    }
}
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
