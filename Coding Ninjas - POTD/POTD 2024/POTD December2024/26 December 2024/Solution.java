import java.util.* ;
import java.io.*; 

public class Solution {

    public static Queue<Integer> reverseQueue(Queue<Integer> q) {
  
      // Write your code here.
      ArrayList<Integer> list = new ArrayList<>();
      
      while(!q.isEmpty()){
        list.add(q.poll());
      }

      Collections.reverse(list);
      
      for(int i: list){
        q.add(i);
      }

      return q;
    }
  }