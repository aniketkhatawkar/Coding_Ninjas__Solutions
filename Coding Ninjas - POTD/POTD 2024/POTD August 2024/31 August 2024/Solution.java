import java.util.* ;
import java.io.*; 
public class Solution {

    public static List<Long> multiplication(int[] arr) {
        // Write your code here.
        List<Long> list = new ArrayList<>();
        int n=arr.length;

        list.add((long)-1);
        if(n<2){
            return list;
        }
        list.add((long)-1);
        if(n<3){
            return list;
        }

        PriorityQueue<Long> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.add((long)arr[0]);
        queue.add((long)arr[1]);

        for(int i=2; i<n; i++){
            queue.add((long)arr[i]);
            
            long temp1=queue.poll();
            long temp2=queue.poll();
            long temp3=queue.poll();

            list.add(temp1*temp2*temp3);

            queue.add(temp1);
            queue.add(temp2);
            queue.add(temp3);
        }

        return list;
    }

}
