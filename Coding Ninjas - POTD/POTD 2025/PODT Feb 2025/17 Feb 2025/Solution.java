import java.util.*;

public class Solution {
    public static String infixToPostfix(String exp) {
        // Write your code here
        Stack<Character> st = new Stack<>();
        StringBuffer sb = new StringBuffer();
        int n=exp.length();
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('+', 1);
        map.put('-', 1);
        map.put('*', 2);
        map.put('/', 2);
        map.put('^', 3);

        for(int i=0; i<n; i++){
            char ch=exp.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }
            else if(ch=='('){
                st.push(ch);
            }
            else if(ch==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    sb.append(st.pop());
                }

                st.pop();
            }
            else {
                while(!st.isEmpty() && st.peek()!='(' && map.getOrDefault(st.peek(), 0)>=map.get(ch)){
                    sb.append(st.pop());
                }
                st.push(ch);
            }
        }

        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.toString();
    }
}