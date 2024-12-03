import java.util.Stack;

public class Solution {
    public static boolean isValidParenthesis(String s) {
        // Write your code here.
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty() || !isMatchingPair(stack.peek(), c)) {
                    return false;
                }
                stack.pop();
            }
        }
        
        return stack.isEmpty();
    }
    
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}