package main.java;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "]";
        System.out.println(isValid(str));
    }

    private static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for (int index = 0; index < str.length(); index++) {

            if (!stack.isEmpty() && (str.charAt(index) == ')' && stack.peek().equals('(')
                    || str.charAt(index) == '}' && stack.peek().equals('{')
                    || str.charAt(index) == ']' && stack.peek().equals('['))) {
                stack.pop();
            } else {
                stack.push(str.charAt(index));
            }
        }
        return stack.isEmpty();
    }
}
