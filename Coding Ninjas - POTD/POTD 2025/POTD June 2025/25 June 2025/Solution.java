import java.util.* ;
import java.io.*; 

public class Solution {

	public static List<List<Integer>> fahrenheitToCelsius(int s, int e, int w) {
		// Write your code here
		List<List<Integer>> ans = new ArrayList<>();

		for(int i=s; i<=e; i+=w){
			List<Integer> list = new ArrayList<>();

			int temp=(i-32)*5/9;

			list.add(i);
			list.add(temp);

			ans.add(list);

		}

		return ans;

	}

}
