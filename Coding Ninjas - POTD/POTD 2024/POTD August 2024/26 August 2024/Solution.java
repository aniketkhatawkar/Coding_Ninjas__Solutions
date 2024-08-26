import java.util.* ;
import java.io.*; 
public class Solution {
	public static ArrayList<Integer> theOrder(int n) {
		// Write your code here.
		ArrayList<Integer> ans = new ArrayList<>();
		Queue<Integer> q = new LinkedList<>();

		for(int i=1; i<=n; ++i){
			q.add(i);
		}
		q.add(q.poll());

		while(q.isEmpty()!=true){
			ans.add(q.poll());
			if(!q.isEmpty()){
				q.add(q.poll());
			}
		}

		return ans;
	}
}