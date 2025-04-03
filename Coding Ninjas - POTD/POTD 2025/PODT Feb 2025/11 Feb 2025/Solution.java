import java.util.* ;
import java.io.*; 

public class Solution {

	public static List<List<Integer>> fahrenheitToCelsius(int s, int e, int w) {
		// Write your code here
		List<List<Integer>> list = new ArrayList<>();

		for(int i=s; i<=e; i+=w){
			int c=(int)((i-32)*5.0/9);
			list.add(Arrays.asList(i,c));
		}

		return list;
	}

}
