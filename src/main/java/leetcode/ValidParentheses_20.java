package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses_20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '{' || c == '(' || c == '['){
                stack.push(c);
            }else {
                if(stack.isEmpty()){
                    return false;
                }else {
                    char peek = stack.peek();
                    if((peek == '(' && c == ')') || (peek == '[' && c == ']') || (peek == '{') && c == '}'){
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses_20 test = new ValidParentheses_20();
        System.out.println(test.isValid("()"));
        System.out.println(test.isValid("(){}[]"));
        System.out.println(test.isValid("({[})"));
    }
}

/**
 * s = ()
 * )
 * (
 *
 * s = ()[]{}
 * }
 * {
 * ]
 * [
 * )
 * (
 *
 */
