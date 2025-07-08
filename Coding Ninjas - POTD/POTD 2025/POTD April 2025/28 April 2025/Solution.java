import java.util.* ;
import java.io.*; 
public class Solution {
	public static ArrayList<Integer> theOrder(int n) {
		// Write your code here.
		ArrayList<Integer> ans = new ArrayList<>();
		Queue<Integer> que = new LinkedList<>();

		for(int i=1; i<=n; i++){
			que.add(i);
		}

		while(!que.isEmpty()){
			if(!que.isEmpty()){
				que.add(que.poll());
			}

			if(!que.isEmpty()){
				ans.add(que.poll());
			}
		}

		return ans;
	}
}

