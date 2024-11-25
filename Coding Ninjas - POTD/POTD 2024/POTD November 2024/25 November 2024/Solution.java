import java.util.* ;
import java.io.*; 
public class Solution {

    public static int[] sweet(int[] S) {

        // Write your Code here
        int n=S.length;
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<n; i++){
            st.push(i+1);

            while(!st.isEmpty() && S[i]>(i+1-st.peek())) {
                ans[st.peek()-1]=1;
                st.pop();
            }
        }

        return ans;
    }
}