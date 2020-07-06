package demo;

import java.util.Stack;

public class Demo20 {

    public static void main(String[] args) {
        String str = "";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        int index = 0;
        while (index < s.length()) {
            Character c = s.charAt(index);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()){
                    return false;
                }
                Character stackTop = stack.peek();
                if ((stackTop == '(' && c == ')') || (stackTop == '[' && c == ']') || (stackTop == '{' && c == '}')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
            index++;
        }
        return stack.isEmpty();
    }
}
