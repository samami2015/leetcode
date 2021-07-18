import java.util.LinkedList;
import java.util.Queue;

class LC0225 {

    /** Initialize your data structure here. */
    public LC0225() {

    }

    /** Push element x onto stack. */
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();
    private int top;

    // Push element x onto stack.
    public void push(int x) {
        q1.add(x);
        top = x;
    }

    /** Removes the element on top of the stack and returns that element. */
    // Removes the element on top of the stack.
    public int pop() {
        while (q1.size() > 1) {
            top = q1.remove();
            q2.add(top);
        }
        int ret = q1.remove();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return ret;
    }
    /** Get the top element. */
    public int top() {
        return top;
    }

    /** Returns whether the stack is empty. */
// Returns whether the stack is empty.
    public boolean empty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        LC0225 stack = new LC0225();
        stack.push(1);
        stack.push(2);
        int ret = stack.pop();
        System.out.println(ret);
        ret = stack.top();
        System.out.println(ret);
        boolean bret = stack.empty();
        System.out.println(bret);
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */