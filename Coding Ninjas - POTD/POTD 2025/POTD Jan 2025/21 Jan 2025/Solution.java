import java.util.* ;
import java.io.*; 
public class Solution {
    public static String reverseOnlyLetters(String s) {
        // Write your code here.
        Stack<Character> st = new Stack<>();
        HashMap<Integer, Character> map = new HashMap<>();

        int n=s.length();

        StringBuffer sb = new StringBuffer();

        for(int i=0; i<n; i++){
            char ch=s.charAt(i);
            if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)){
                st.push(ch);
            }
            else {
                map.put(i, ch);
            }
        }

        for(int i=0; i<n; i++){
            if(map.containsKey(i)){
                sb.append(map.get(i));
            }
            else {
                sb.append(st.pop());
            }
        }

        return sb.toString();
    }
}