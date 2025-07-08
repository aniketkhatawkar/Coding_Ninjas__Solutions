import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<ArrayList<Integer>> numberPattern(int n) {

		// Write your code here.
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		int index=0;

		for(int i=1; i<=n; i++){
			ArrayList<Integer> arr = new ArrayList<>();

			for(int j=1; j<=n-i; j++){
				arr.add(-1);
			}
			
			for(int j=1; j<=i; j++){
				arr.add((index++%9)+1);
			}

			ans.add(arr);
		}

		return ans;
	}
}