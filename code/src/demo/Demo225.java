package demo;

import java.util.ArrayList;
import java.util.List;

public class Demo225 {

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
        stack.push(4);
        stack.push(5);
        System.out.println(stack.top());
        stack.pop();
        stack.pop();
        System.out.println(stack.empty());
        stack.pop();
        stack.pop();
        System.out.println(stack.empty());
    }

}
class MyStack {
    List<Integer> list=new ArrayList<>();

    /** Initialize your data structure here. */
    public MyStack() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        list.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return list.remove(list.size()-1);
    }

    /** Get the top element. */
    public int top() {
        return list.get(list.size()-1);
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return list.isEmpty();
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
