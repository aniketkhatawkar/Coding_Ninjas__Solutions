import java.util.ArrayList;
import java.util.PriorityQueue;

public class Solution {

	public static int getKthLargest(ArrayList<Integer> arr, int k) {

		// Write your code here
		PriorityQueue<Integer> queue = new PriorityQueue<>();

		for(int i=0; i<arr.size(); i++){
			int currsum=0;

			for(int j=i; j<arr.size(); j++){
				currsum+=arr.get(j);

				if(queue.size()<k){
					queue.add(currsum);
				}
				else if(currsum>queue.peek()){
					queue.poll();
					queue.add(currsum);
				}
			}
		} 
		return queue.peek();
	}
}