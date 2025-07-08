import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean isValid(String str) {
        if(str.length()%2!=0){
            return false;
        }

        return isBalance(str, new Stack<>(), 0);
    }

    public static boolean isBalance(String str, Stack<Character> st , int index){
        if(index==str.length()){
            return st.isEmpty();
        }

        char curr=str.charAt(index);

        if(curr=='[' || curr=='{' || curr=='('){
            st.push(curr);
            return isBalance(str, st, index+1);
        }
        else if(curr==']' || curr=='}' || curr==')'){
            if(st.isEmpty()){
                return false;
            }
            char top=st.pop();
            if(!isMatch(top, curr)){
                return false;
            }

            return isBalance(str, st, index+1);
        }
        else if(curr=='X'){
            Stack<Character> open = (Stack<Character>) st.clone();
            open.push('X');
            if(isBalance(str, open, index+1)){
                return true;
            }

            if(st.isEmpty()){
                return false;
            }

            Stack<Character> close = (Stack<Character>) st.clone();
            close.pop();
            return isBalance(str, close, index+1);
        }

        return false;
    }

    public static boolean isMatch(char op, char clo){
        return (op=='{' && clo=='}') ||
                (op=='[' && clo==']') ||
                (op=='(' && clo==')') ||
                op=='X';
    }
}