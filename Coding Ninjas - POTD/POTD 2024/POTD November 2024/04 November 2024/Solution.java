import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> absDiff(ArrayList<Integer> arr, int n) {
		// Write your code here.
		ArrayList<Integer> ans= new ArrayList<>();

		int diffeven=0;
		int diffodd=0;

		for(int i=0; i<n; i+=2){
			diffeven=Math.abs(diffeven-arr.get(i));
		}

		for(int i=1; i<n; i+=2){
			diffodd=Math.abs(diffodd-arr.get(i));
		}

		ans.add(diffeven);
		ans.add(diffodd);

		return ans;
	}
}