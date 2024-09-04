import java.util.* ;
import java.io.*; 
import java.util.Queue;

public class Solution {
    public static void reverse(Queue<Integer> queue, int k){
        // Write your code here.
        int n=queue.size();

        Stack<Integer> st= new Stack<>();

        for(int i=0; i<k; i++){
            st.push(queue.poll());
        }

        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0; i<(n-k); i++){
            al.add(queue.poll());
        }

        for(int i=0; i<k; i++){
            queue.add(st.pop());
        }

        int index=0;

        for(int i=0; i<(n-k); i++){
            queue.add(al.get(index++));
        }
    }
}