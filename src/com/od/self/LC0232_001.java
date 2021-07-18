package com.od.self;

import java.util.Stack;

public class LC0232_001 {
    /** Initialize your data structure here. */
    public LC0232_001() {

    }

    private Stack<Integer> s1 = new Stack<Integer>();
    private Stack<Integer> s2 = new Stack<Integer>();

    /** Push element x to the back of queue. */
    private int front;
    public void push(int x) {
        if(s1.empty()){
            front = x;
        }
        while(!s1.empty()){
            s2.push(s1.pop());
        }
        s2.push(x);
        while (!s2.empty()){
            s1.push(s2.pop());
        }

    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int ret = s1.pop();
        if(!s1.empty()){
            front = s1.peek();
        }
        return ret;
    }

    /** Get the front element. */
    public int peek() {
        return front;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.empty();
    }
}
