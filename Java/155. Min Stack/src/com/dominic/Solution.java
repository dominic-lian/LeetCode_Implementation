package com.dominic;

import java.util.Stack;

class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> min;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<Integer>();
        min = new Stack<Integer>();
    }

    public void push(int x) {
        stack.push(x);
        if (min.isEmpty() || x <= min.peek()) {
            min.push(x);
        }
    }

    public void pop() {
        if (stack.peek().equals(min.peek())) {
            stack.pop();
            min.pop();
        } else {
            stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}