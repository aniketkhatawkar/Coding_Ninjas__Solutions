import java.util.* ;
import java.io.*; 
public class Solution 
{
  public static Queue<Integer> reverseElements(Queue<Integer> q, int k) 
  {
    // Write your code here.
    Stack <Integer> st = new Stack<>();

    for(int i=0; i<k; i++){
        st.add(q.poll());
    }

    while(!st.isEmpty()){
        q.add(st.pop());
    }

    for(int i=0; i<q.size()-k; i++){
        int temp=q.poll();
        q.add(temp);
    }

    return q;
    
  }
}