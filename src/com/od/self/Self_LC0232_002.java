package com.od.self;

import java.util.Stack;

public class Self_LC0232_002 {
    /** Initialize your data structure here. */
    public Self_LC0232_002() {

    }

    private Stack<Integer> s1 = new Stack<Integer>();
    private Stack<Integer> s2 = new Stack<Integer>();

    /** Push element x to the back of queue. */
    private int front;
    public void push(int x) {
        if(s1.isEmpty()){
            front = x;
        }
        s1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return  s2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(!s2.isEmpty()){
            return s2.peek();
        }
        return front;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.empty()&&s2.isEmpty();
    }
}
